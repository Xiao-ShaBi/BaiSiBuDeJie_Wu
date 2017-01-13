package com.wzf.basibudejie_wu.data.utils;

import com.wzf.basibudejie_wu.data.Data;
import com.wzf.basibudejie_wu.interfaces.CallBack;
import com.wzf.basibudejie_wu.utils.NetUtils;
import com.wzf.basibudejie_wu.utils.UrlUtils;

import okhttp3.Call;

/**
 * 正常的获取数据的方法
 */

public class GetDataFromNet {

    /**
     * 联网请求数据，解析并且存储到Data中
     */
    public void getData(int homeFragmentNum, int subFragmentNum) {
        //根据位置拿到当前页面的数据地址
        String subUrl = Data.getInstance().getTabBean().getMenus().get(homeFragmentNum).getSubmenus().get(subFragmentNum).getUrl();
        String url = UrlUtils.SUB_VIEW_URL(subUrl);

        NetUtils.okHttp(url, new CallBack() {
            @Override
            public void Error(Call call, String err, int id) {
                
            }

            @Override
            public void Success(String response, int id) {

            }
        });
    }
}
