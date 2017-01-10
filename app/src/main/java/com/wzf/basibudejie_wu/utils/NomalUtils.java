package com.wzf.basibudejie_wu.utils;

/**
 * 常用的一些工具
 */

public class NomalUtils {
    public static boolean isEmpty(String string) {
        if (string == null || string.length() <= 0) {
            return true;
        }
        return false;
    }
}
