package com.wzf.basibudejie_wu.activities;

import android.support.v4.app.Fragment;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioGroup;

import com.atguigu.chengchangqing.baisibudejie_wu.R;
import com.wzf.basibudejie_wu.base.BaseActivity;
import com.wzf.basibudejie_wu.fragments.HomeFragment;
import com.wzf.basibudejie_wu.fragments.SubHomeFragment.AttentionFragment;
import com.wzf.basibudejie_wu.fragments.SubHomeFragment.MyFragment;
import com.wzf.basibudejie_wu.fragments.SubHomeFragment.PostFragment;
import com.wzf.basibudejie_wu.utils.FragmentChoiceUtils;

import java.util.ArrayList;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.fl_main_store_fragment)
    FrameLayout flMainStoreFragment;
    @BindView(R.id.iv_main_middle)
    ImageView ivMainMiddle;
    @BindView(R.id.rg_main_bottom)
    RadioGroup rgMainBottom;

    /**
     * fragment的管理类
     */
    private FragmentChoiceUtils fragmentChoiceUtils;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        initData();

        initListener();
    }

    private void initData() {
        ArrayList<Fragment> list = new ArrayList<>(4);

        list.add(new HomeFragment(new PostFragment()));
        list.add(new HomeFragment(new PostFragment()));
        list.add(new HomeFragment(new AttentionFragment()));
        list.add(new HomeFragment(new MyFragment()));

        fragmentChoiceUtils = new FragmentChoiceUtils(list, getSupportFragmentManager(),R.id.fl_main_store_fragment);
    }

    /**
     * 监听RadioGroup专题的变化
     */
    private void initListener() {
        rgMainBottom.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                int position = 0;
                switch (checkedId) {
                    case R.id.rb_best://精选
                        position = 0;
                        break;
                    case R.id.rb_latest://最新
                        position = 1;
                        break;
                    case R.id.rb_news://关注
                        position = 2;
                        break;
                    case R.id.rb_my://个人
                        position = 3;
                        break;
                }

                fragmentChoiceUtils.switchFragment(position);

            }
        });

        //默认选中首页-放在setOnCheckedChangeListener 执行之后
        rgMainBottom.check(R.id.rb_best);

    }
}
