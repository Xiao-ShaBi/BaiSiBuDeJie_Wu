package com.wzf.basibudejie_wu.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import java.util.ArrayList;

/**
 * 将初始化好的fragment的list传入，根据传入的fragment的位置来现实和隐藏fragment的工具
 * 将当前fragment维持在当前类中
 */

public class FragmentChoiceUtils {

    /**
     * 传入的需要管理的fragments
     */
    private ArrayList<Fragment> fragments;

    /**
     * 传入的管理器
     */
    private FragmentManager fragmentManager;

    /**
     * 当前显示的fragment
     */
    private Fragment tempFragment;

    /**
     * 需要加载进入的布局文件
     */
    private int layout;


    /**
     * 默认不选，如果不喜欢可以设置setFirstFragment
     *
     * @param fragments
     * @param fragmentManager
     */
    public FragmentChoiceUtils(ArrayList<Fragment> fragments, FragmentManager fragmentManager, int layout) {
        this(fragments, fragmentManager, layout, -1);
    }


    public FragmentChoiceUtils(ArrayList<Fragment> fragments, FragmentManager fragmentManager, int layout, int position) {
        this.layout = layout;
        this.fragments = fragments;
        this.fragmentManager = fragmentManager;
        if(position != -1) {
            switchFragment(position);
        }
    }


    /**
     * 传入当前要显示的Fragment
     *
     * @param position
     */
    public void switchFragment(int position) {
        if (position >= fragments.size() || position < 0) {
            throw new RuntimeException("FragmentChoiceUtils 拿到超出下标的position");
        }
        Fragment currentFragment = fragments.get(position);
        if (tempFragment != currentFragment) {

            if (currentFragment != null) {
                //开启事务
                FragmentTransaction ft = fragmentManager.beginTransaction();

                if (!currentFragment.isAdded()) {
                    //隐藏之前显示的
                    if (tempFragment != null) {
                        ft.hide(tempFragment);
                    }
                    //判断currentFragment 有没有添加，如果没有就添加
                    ft.add(layout, currentFragment);


                } else {
                    //隐藏之前显示的
                    if (tempFragment != null) {
                        ft.hide(tempFragment);
                    }
                    //否则就显示
                    ft.show(currentFragment);
                }

                ft.commit();//统一提交

            }
            tempFragment = currentFragment;
        }

    }

}
