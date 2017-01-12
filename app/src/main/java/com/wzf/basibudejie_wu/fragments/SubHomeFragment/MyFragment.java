package com.wzf.basibudejie_wu.fragments.SubHomeFragment;

import android.view.View;
import android.widget.TextView;

import com.wzf.basibudejie_wu.base.BaseFragment;

/**
 * 我的fragment界面
 */

public class MyFragment extends BaseFragment {
    @Override
    protected View initView() {
        TextView textView = new TextView(mContext);
        textView.setText("wo de ");
        return textView;
    }
}
