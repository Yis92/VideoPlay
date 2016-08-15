package com.video.sunny.vm.user.view;

import android.widget.Button;
import android.widget.EditText;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.video.sunny.R;
import com.video.sunny.base.BaseActivity;

/**
 * 登录
 * Created by liu on 16/8/4.
 */
public class LoginActivity extends BaseActivity implements IUserLoginView{

    @ViewInject(R.id.btn_login)
    private Button btnLogin;

    @ViewInject(R.id.et_username)
    private EditText etUsername;

    @ViewInject(R.id.et_password)
    private EditText etPassword;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_user_login);
        ViewUtils.inject(this);
    }

    @Override
    protected void initTopbar() {

    }

    @Override
    public String getUername() {
        return etUsername.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return etPassword.getText().toString().trim();
    }
}
