package com.wzf.basibudejie_wu.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * 常用的一些工具
 */

public class NomalUtils {

    /**
     * application的context在有些地方可以直接调用
     */
    private static Context appContext;

    /**
     * 初始化NomalUtils
     */
    public static void initNomalUtils(Context mContext) {
        appContext = mContext;
    }

    public static boolean isEmpty(String string) {
        if (string == null || string.length() <= 0) {
            return true;
        }
        return false;
    }

    /**
     * 获得appContext
     *
     * @return
     */
    public static Context getAppContext() {
        return appContext;
    }

    /**
     * 吐司工具，有些不好获得context的地方直接调用
     */
    public static void toast(String str){
        Toast.makeText(appContext, str, Toast.LENGTH_SHORT).show();
    }
}
