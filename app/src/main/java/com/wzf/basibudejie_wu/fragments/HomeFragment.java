package com.wzf.basibudejie_wu.fragments;

import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.atguigu.chengchangqing.baisibudejie_wu.R;
import com.wzf.basibudejie_wu.base.BaseFragment;

/**
 * 下边的四个fragment，作为主fragment，
 * 使用同一个fragment，再往里面添加不同的fragment
 */

public class HomeFragment extends BaseFragment {

    private BaseFragment fragment;

    public HomeFragment() {
    }

    public HomeFragment(BaseFragment fragment) {
        this.fragment = fragment;
    }

    @Override
    protected View initView() {
        View view = View.inflate(mContext, R.layout.fragment_main_home, null);
        return view;
    }

    @Override
    protected void initData() {
        //初始化view，添加需要的数据
        if (fragment != null) {
            FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
            transaction.add(R.id.fl_main_home_show, fragment).commit();
        }
    }

}
