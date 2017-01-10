package com.wzf.basibudejie_wu.utils;

/**
 * 使用这个工具类来获得所有需要使用的url
 */

public class UrlUtils {

    /**
     * 基础数据，拿到精华和新帖的头和内容的url
     */
    public static final String BASE_URL = "http://s.budejie.com/public/list-appbar/budejie-android-6.6.3/";


    /**
     * 根据拿到的前半部分url拼出需要的子view中数据的url
     */
    public static String SUB_VIEW_URL(String pre_url) {
        return pre_url + "budejie-android-6.6.3/0-20.json";
    }

}
