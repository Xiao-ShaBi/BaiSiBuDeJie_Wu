package com.wzf.basibudejie_wu.data.utils;

import android.widget.Toast;

import com.alibaba.fastjson.JSONObject;
import com.wzf.basibudejie_wu.bean.TabBean;
import com.wzf.basibudejie_wu.data.Data;
import com.wzf.basibudejie_wu.interfaces.CallBack;
import com.wzf.basibudejie_wu.log.Wzf;
import com.wzf.basibudejie_wu.utils.NetUtils;
import com.wzf.basibudejie_wu.utils.NomalUtils;
import com.wzf.basibudejie_wu.utils.UrlUtils;

import okhttp3.Call;

/**
 * 联网，并且为Data付值
 */

public class GetTabDataFromNet {

    /**
     * 定义联网的三种状态 成功、正在链接、未链接、链接失败
     */
    public static final int SUCCESS = 0;

    public static final int FAIL = 1;

    public static final int LANDING = 2;

    public static final int NOLINK = 3;

    /**
     * 记录当前第一次联网的联网状态
     */
    public static int FIRST_LANDING = NOLINK;

    /**
     * 联网获得
     * 精华和新帖的Tab标题地址
     */
    public static void getTabDataFromNet(final int level) {

        if (FIRST_LANDING == SUCCESS || FIRST_LANDING == LANDING) {
            return;
        }

        FIRST_LANDING = LANDING;

        if (!NetUtils.isNetworkAvailable(NomalUtils.getAppContext())) {
            FIRST_LANDING = FAIL;
            Toast.makeText(NomalUtils.getAppContext(), "当前网络不可用", Toast.LENGTH_SHORT).show();
            return;
        }

        NetUtils.okHttp(UrlUtils.BASE_URL, new CallBack() {
            @Override
            public void Error(Call call, String err, int id) {
                FIRST_LANDING = FAIL;
                NomalUtils.toast(err);
                Wzf.l("getTabDataFromNet - " + level + " - " + err);
            }

            @Override
            public void Success(String response, int id) {
                FIRST_LANDING = SUCCESS;
                if (level == LOCAL_GET_DATA) {

                    TabBean tabBean = JSONObject.parseObject(response, TabBean.class);

                    Data.getInstance().setTabBean(tabBean, level);
                }
            }
        });

    }

    /**
     * 联网级别 分三个等级，分别为第一次appliction时联网
     * 在mainactivity
     * 在加载main之后调用刷新方法去更新数据
     */

    /**
     * 本地获取的数据
     */
    public static final int LOCAL_GET_DATA = 0;

    /**
     * 联网级别高的可以更新联网级别低的数据
     * 第一次联网，在application中
     */
    public static final int FIRST_GET_DATA = 1;

    /**
     * 第二次联网，在进入mainactivity之后发现数据为空
     * 进行第二次联网获取头和其他子连接地址
     */
    public static final int SECOND_GET_DATA = 2;

    /**
     * 第三次联网，在进入main之后依然为空，说明网有问题，
     * 去获取数据
     */
    public static final int THIND_GET_DATA = 3;

}
