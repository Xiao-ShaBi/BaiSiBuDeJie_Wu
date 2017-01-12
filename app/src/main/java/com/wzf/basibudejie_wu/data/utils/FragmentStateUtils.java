package com.wzf.basibudejie_wu.data.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wzf.basibudejie_wu.data.FragmentState;
import com.wzf.basibudejie_wu.utils.CacheUtils;
import com.wzf.basibudejie_wu.utils.NomalUtils;

/**
 * 用来为FragmentState存入sp文件和从sp文件中读取数据使用
 */

public class FragmentStateUtils {

    /**
     * 当前状态存入的文件名称
     */
    public static final String FRAGMENT_STATE = "fragment_state";

    /**
     * 存入当前状态使用的key
     */
    public static final String STATE = "state";

    /**
     * 从sp文件中读出数据并装载入FragmentState中
     */
    public static void initState() {
        String s = CacheUtils.getString(NomalUtils.getAppContext(), FRAGMENT_STATE, STATE);
        if (NomalUtils.isEmpty(s)) {
            FragmentState.getInstance().setHomeFragmentNum(0);
            FragmentState.getInstance().setListNum(0);
            FragmentState.getInstance().setSubFragmentNum(0);
        } else {
            JSONObject jsonObject = JSONObject.parseObject(s);
            FragmentState.getInstance().setHomeFragmentNum(jsonObject.getInteger("homeFragmentNum"));
            FragmentState.getInstance().setListNum(jsonObject.getInteger("listNum"));
            FragmentState.getInstance().setSubFragmentNum(jsonObject.getInteger("subFragmentNum"));
        }
    }

    /**
     * 讲对象的数据存储到sp文件中
     */
    public static void storeState() {
        String s = JSON.toJSONString(FragmentState.getInstance());

        CacheUtils.putString(NomalUtils.getAppContext(), FRAGMENT_STATE, STATE, s);
    }


}
