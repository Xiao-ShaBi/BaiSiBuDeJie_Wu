package com.wzf.basibudejie_wu.fragments;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
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
    @BindView(R.id.post_show)
    ViewPager postShow;


    private String value;
//    @BindView(R.id.rv_post_show_items)
//    RecyclerView rvPostShowItems;

    public PostFragment() {
    }

    public PostFragment(String value) {
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

        postShow.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return 2;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {

                RecyclerView view = (RecyclerView) View.inflate(mContext,R.layout.test,null);
                view.setAdapter(new RecyclerView.Adapter() {
                    @Override
                    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                        TextView textView = new TextView(mContext);
                        return new MyViewHolder(textView);
                    }

                    @Override
                    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                        ((TextView)holder.itemView).setText("====" + position);
                    }

                    @Override
                    public int getItemCount() {
                        return 100;
                    }

                    class MyViewHolder extends RecyclerView.ViewHolder{

                        public MyViewHolder(View itemView) {
                            super(itemView);
                            ButterKnife.bind(this,itemView);
                        }
                    }
                });
                container.addView(view);

                return view;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                super.destroyItem(container, position, object);
                container.removeView((View) object);
            }
        });
    }

}
