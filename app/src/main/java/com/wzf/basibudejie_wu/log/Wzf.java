package com.wzf.basibudejie_wu.log;

import android.util.Log;

/**
 * 自定义的日志类，用于以后清空日志，或将日志打再本地
 */

public class Wzf {

    public static void l(String log){
        Log.e("TAG", log);
    }
}
