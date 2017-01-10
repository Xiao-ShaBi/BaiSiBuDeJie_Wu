package com.wzf.basibudejie_wu.interfaces;

import okhttp3.Call;


/**
 * 用于反回联网请求的消息
 */
public interface CallBack {
    void Error(Call call, String err, int id);

    void Success(String response, int id);
}
