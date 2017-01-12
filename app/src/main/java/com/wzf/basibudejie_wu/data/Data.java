package com.wzf.basibudejie_wu.data;

import com.wzf.basibudejie_wu.bean.TabBean;

/**
 * 存储当前是用到的数据，以对象形式加载在内存，
 * 数据只有那么一份，不再其他地方存储
 */

public class Data {

    //这里就是单例的使用
    private static volatile Data sInst = null;  // <<< 这里添加了 volatile

    public static Data getInstance() {
        Data inst = sInst;  // <<< 在这里创建临时变量
        if (inst == null) {
            synchronized (Data.class) {
                inst = sInst;
                if (inst == null) {
                    inst = new Data();
                    sInst = inst;
                }
            }
        }
        return inst;  // <<< 注意这里返回的是临时变量
    }

    /**
     * tab的数据
     */
    private TabBean tabBean;

    /**
     * tab数据的状态
     */
    private int level;

    public int getLevel() {
        return level;
    }

    public TabBean getTabBean() {
        return tabBean;
    }

    public void setTabBean(TabBean tabBean, int level) {
        this.tabBean = tabBean;
        this.level = level;
    }
}
