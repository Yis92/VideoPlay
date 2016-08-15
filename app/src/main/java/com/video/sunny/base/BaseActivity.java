package com.video.sunny.base;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


/**
 * <p>Description: TCBBaseActivity</p>
 * <p>Company: 投资啦</p>
 * <p>Create Time:2015/8/9 16:46</p>
 *
 * @author MiaoWenHai
 */
public abstract class BaseActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initTopbar();
    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    /**
     * 初始化布局
     */
    protected abstract void initView();

    /**
     * 初始化头部
     */
    protected abstract void initTopbar();

}
