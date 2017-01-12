package com.wzf.basibudejie_wu.data;

/**
 * 记录当前fragment的状态
 */

public class FragmentState {

    private int homeFragmentNum;

    private int subFragmentNum;

    private int listNum;

    public int getHomeFragmentNum() {
        return homeFragmentNum;
    }

    public void setHomeFragmentNum(int homeFragmentNum) {
        this.homeFragmentNum = homeFragmentNum;
    }

    public int getSubFragmentNum() {
        return subFragmentNum;
    }

    public void setSubFragmentNum(int subFragmentNum) {
        this.subFragmentNum = subFragmentNum;
    }

    public int getListNum() {
        return listNum;
    }

    public void setListNum(int listNum) {
        this.listNum = listNum;
    }

    //这里就是单例的使用
    private static volatile FragmentState sInst = null;  // <<< 这里添加了 volatile

    public static FragmentState getInstance() {
        FragmentState inst = sInst;  // <<< 在这里创建临时变量
        if (inst == null) {
            synchronized (FragmentState.class) {
                inst = sInst;
                if (inst == null) {
                    inst = new FragmentState();
                    sInst = inst;
                }
            }
        }
        return inst;  // <<< 注意这里返回的是临时变量
    }
}
