package com.wzf.basibudejie_wu.data.utils;

import com.wzf.basibudejie_wu.utils.CacheUtils;
import com.wzf.basibudejie_wu.utils.NomalUtils;

/**
 * 从本地获取数据
 */

public class DataFromLocal {

    /**
     * 存放tab信息的位置
     */
    public static final String TAB_LOCAL_INFO = "tabinfo";

    /**
     * 存放的tab信息的key
     */
    public static final String TAB_LOCAL_KEY = "tabkey";

    /**
     * 存放tab的信息到本地，等待下次加载使用
     *
     * @param str
     */
    public static void putTabInfoToLocal(String str) {
        CacheUtils.putString(NomalUtils.getAppContext(),
                TAB_LOCAL_INFO, TAB_LOCAL_KEY, str);
    }

    /**
     * 从本地获取tab的信息
     */
    public static String getTabLocalInfo() {
        return CacheUtils.getString(NomalUtils.getAppContext(),
                TAB_LOCAL_INFO, TAB_LOCAL_KEY);
    }
}
