package com.wzf.basibudejie_wu.utils;

import com.wzf.basibudejie_wu.interfaces.CallBack;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

/**
 * 基于洪阳大神的okhttp3的工具类
 * compile 'com.zhy:okhttputils:2.6.2'
 * 联网请求的二次封装
 */

public class NetUtils {

    public static void okHttp(String url, final CallBack callBack) {
        OkHttpUtils
                .get()
                .url(url)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        callBack.Error(call, e.getMessage(), id);
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        callBack.Success(response, id);
                    }
                });
    }
}

