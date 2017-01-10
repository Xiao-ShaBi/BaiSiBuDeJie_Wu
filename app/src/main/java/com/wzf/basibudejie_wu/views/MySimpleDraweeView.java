package com.wzf.basibudejie_wu.views;

import android.content.Context;
import android.util.AttributeSet;

import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * 重写SimpleDraweeView，用来
 */

public class MySimpleDraweeView extends SimpleDraweeView {
    public MySimpleDraweeView(Context context, GenericDraweeHierarchy hierarchy) {
        super(context, hierarchy);
    }

    public MySimpleDraweeView(Context context) {
        super(context);
    }

    public MySimpleDraweeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MySimpleDraweeView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public MySimpleDraweeView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
