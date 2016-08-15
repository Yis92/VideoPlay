package com.video.sunny.entity.user.request;

import com.google.gson.annotations.SerializedName;

/**
 * 登录请求实体参数
 * Created by liu on 16/8/4.
 */
public class UserLoginReq {

    @SerializedName("password")
    private String password;

    @SerializedName("mobile")
    private String mobile;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
