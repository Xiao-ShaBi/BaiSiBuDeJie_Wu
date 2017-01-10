package com.wzf.basibudejie_wu.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * 这里使用一个基础的activity，以后的都继承于它
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);

        initView();
    }

    protected void initView() {

    }

    protected abstract int getLayout();
}
