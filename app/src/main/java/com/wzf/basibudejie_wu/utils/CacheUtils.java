package com.wzf.basibudejie_wu.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * sp存储工具
 */

public class CacheUtils {

    public static void putString(Context context, String txt, String key, String value) {
        SharedPreferences sp = context.getSharedPreferences(txt, Context.MODE_PRIVATE);
        sp.edit().putString(key, value).commit();
    }

    public static String getString(String txt, Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences(txt, Context.MODE_PRIVATE);
        return sp.getString(key, "");
    }

    public static void putMode(String txt, Context context, String key, int value) {
        SharedPreferences sp = context.getSharedPreferences(txt, Context.MODE_PRIVATE);
        sp.edit().putInt(key, value).commit();
    }

    public static int getMode(String txt, Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences(txt, Context.MODE_PRIVATE);
        return sp.getInt(key, -1);
    }

}
