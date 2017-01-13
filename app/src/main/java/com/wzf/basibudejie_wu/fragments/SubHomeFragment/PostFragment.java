package com.wzf.basibudejie_wu.fragments.SubHomeFragment;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.atguigu.chengchangqing.baisibudejie_wu.R;
import com.wzf.basibudejie_wu.base.BaseFragment;
import com.wzf.basibudejie_wu.data.FragmentState;
import com.wzf.basibudejie_wu.data.utils.GetTabDataFromNet;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 这个fragment用来显示items，其中只有一个分类型的recycylerview
 * 精华帖和热贴使用同一个fragment
 */

public class PostFragment extends BaseFragment {

    @BindView(R.id.toolbar)
    CollapsingToolbarLayout toolbar;
    @BindView(R.id.jinghua_tablayout)
    TabLayout jinghuaTablayout;
    @BindView(R.id.post_show)
    ViewPager postShow;

    private int HomeFragmentNum;

    public PostFragment() {
    }

    /**
     * 设置当前fragment的标记
     *
     * @param HomeFragmentNum
     */
    public void setHomeFragmentNum(int HomeFragmentNum) {
        this.HomeFragmentNum = HomeFragmentNum;
    }

    @Override
    protected View initView() {
        View view = View.inflate(mContext, R.layout.fragment_post, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void initData() {
        postShow.setCurrentItem(FragmentState.getInstance().getHomeFragmentNum());

        if (GetTabDataFromNet.FIRST_LANDING == GetTabDataFromNet.SUCCESS) {

        } else if (GetTabDataFromNet.FIRST_LANDING == GetTabDataFromNet.LANDING) {
            //添加adapter到对象中，等待联网成功，刷新adapter
        } else {
            //重新联网，等待联网成功后刷新adapter
        }

//        postShow.setAdapter();
    }

}
