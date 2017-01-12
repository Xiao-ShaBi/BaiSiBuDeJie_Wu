package com.wzf.basibudejie_wu.fragments.SubHomeFragment;

import android.view.View;

import com.atguigu.chengchangqing.baisibudejie_wu.R;
import com.wzf.basibudejie_wu.base.BaseFragment;

import butterknife.ButterKnife;

/**
 * 这个fragment用来显示items，其中只有一个分类型的recycylerview
 * 精华帖和热贴使用同一个fragment
 */

public class PostFragment extends BaseFragment {

    public PostFragment() {
    }


    @Override
    protected View initView() {
        View view = View.inflate(mContext, R.layout.fragment_post, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void initData() {
    }
}
