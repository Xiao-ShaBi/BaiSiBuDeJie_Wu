package com.wzf.basibudejie_wu.fragments;

import android.view.View;

import com.atguigu.chengchangqing.baisibudejie_wu.R;
import com.wzf.basibudejie_wu.base.BaseFragment;

/**
 * 精华帖和热贴使用的fragment
 * 里面分别放两个viewpager用来显示数据
 * 精华帖和热贴使用同一个fragment
 */

public class PostFragment extends BaseFragment {
    @Override
    protected View initView() {
        View view = View.inflate(mContext, R.layout.fragment_post,null);
        return view;
    }
}
