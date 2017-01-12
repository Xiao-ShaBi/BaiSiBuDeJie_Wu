package com.wzf.basibudejie_wu.fragments.SubHomeFragment;

import android.view.View;
import android.widget.TextView;

import com.wzf.basibudejie_wu.base.BaseFragment;

/**
 * 关注页面的fragment
 */

public class AttentionFragment extends BaseFragment {
    @Override
    protected View initView() {
        TextView textView = new TextView(mContext);
        textView.setText("这里是关注页面");
        return textView;
    }
}
