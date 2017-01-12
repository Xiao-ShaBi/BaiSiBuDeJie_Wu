package com.wzf.basibudejie_wu.application;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.wzf.basibudejie_wu.data.utils.FragmentStateUtils;
import com.wzf.basibudejie_wu.utils.NomalUtils;

/**
 * 自己的application，有些使用的东西需要这里初始化
 */

public class BSBDJApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化Fresco类
        Fresco.initialize(this);

        //初始化，我自己的工具类
        NomalUtils.initNomalUtils(this);

        FragmentStateUtils.storeState();
    }
}
