package com.wzf.basibudejie_wu.fragments;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.atguigu.chengchangqing.baisibudejie_wu.R;
import com.wzf.basibudejie_wu.base.BaseFragment;
import com.wzf.basibudejie_wu.bean.PostBean;
import com.wzf.basibudejie_wu.interfaces.CallBack;
import com.wzf.basibudejie_wu.utils.NetUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;

/**
 * 这个fragment用来显示items，其中只有一个分类型的recycylerview
 * 精华帖和热贴使用同一个fragment
 */

public class PostFragment extends BaseFragment {
    private String value;
    @BindView(R.id.tv_current)
    TextView tvCurrent;
//    @BindView(R.id.rv_post_show_items)
//    RecyclerView rvPostShowItems;



    public PostFragment(String value){
        this.value = value;
    }

    @Override
    protected View initView() {
        View view = View.inflate(mContext, R.layout.fragment_post, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void initData() {
        tvCurrent.setText("====" + value);
        NetUtils.okHttp("http://s.budejie.com/topic/list/jingxuan/1/budejie-android-6.6.3/0-20.json", new CallBack() {
            @Override
            public void Error(Call call, String err, int id) {
                Log.e("TAG", "initData");
            }

            @Override
            public void Success(String response, int id) {
                Log.e("TAG", "response" + response);
                PostBean postBean = JSONObject.parseObject(response, PostBean.class);
//                rvPostShowItems.setLayoutManager(new LinearLayoutManager(mContext));
//                rvPostShowItems.setAdapter();
            }
        });
    }

}
