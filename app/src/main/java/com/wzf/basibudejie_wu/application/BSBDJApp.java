package com.wzf.basibudejie_wu.application;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * 自己的application，有些使用的东西需要这里初始化
 */

public class BSBDJApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化Fresco类
        Fresco.initialize(this);
    }
}
