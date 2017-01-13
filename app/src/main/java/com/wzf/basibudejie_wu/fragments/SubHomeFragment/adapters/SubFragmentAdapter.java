package com.wzf.basibudejie_wu.fragments.SubHomeFragment.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.wzf.basibudejie_wu.data.Data;

/**
 * hongfragment的adapter
 * 里面嵌套的是每个fragment具体页面
 */

public class SubFragmentAdapter extends FragmentStatePagerAdapter {

    /**
     * 记录当前Adapter是哪个的Adapter
     * 0：精华 1：新帖
     */
    private int home;

    public void reflash() {
        notifyDataSetChanged();
    }

    public SubFragmentAdapter(FragmentManager fm, int home) {
        super(fm);
        this.home = home;
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return Data.getInstance().getTabBean() == null ? 0 :
                Data.getInstance().getTabBean().getMenus().get(home).getSubmenus().size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Data.getInstance().getTabBean().getMenus().get(home).getSubmenus().get(position).getName();
    }
}
