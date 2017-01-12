package com.wzf.basibudejie_wu.data;

/**
 * 存储当前是用到的数据，以对象形式加载在内存，
 * 数据只有那么一份，不再其他地方存储
 */

public class Data {

    /**
     * 联网级别 分三个等级，分别为第一次appliction时联网
     * 在mainactivity
     * 在加载main之后调用刷新方法去更新数据
     */

    /**
     * 联网级别高的可以更新联网级别低的数据
     * 第一次联网，在application中
     */
    public static final int FIRST_GET_DATA = 0;

    /**
     * 第二次联网，在进入mainactivity之后发现数据为空
     * 进行第二次联网获取头和其他子连接地址
     */
    public static final int SECOND_GET_DATA = 1;

    /**
     * 第三次联网，在进入main之后依然为空，说明网有问题，
     * 去获取数据
     */
    public static final int THIND_GET_DATA = 2;



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

}
