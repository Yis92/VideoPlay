package com.video.sunny.entity.user.resp;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * 登录返回参数
 * Created by liu on 16/8/4.
 */
public class UserLoginResp implements Serializable{

    @SerializedName("uid")
    private int uid;//用户uid
    @SerializedName("username")
    private String username;//用户姓名
    @SerializedName("sex")
    private int sex;//用户性别
    @SerializedName("mobile")
    private String mobile;//用户手机号
    @SerializedName("ip")
    private String ip;//用户ip
    @SerializedName("level")
    private int level;//用户等级
    @SerializedName("avatar")
    private String avatar;//用户默认头像
    @SerializedName("invite_code")
    private String invite_code;//用户邀请码
    @SerializedName("score")
    private String score;//用户积分
    @SerializedName("register_time")
    private String register_time;//用户注册时间
    @SerializedName("token")
    private String token;//用户token标识
    @SerializedName("mobile_code_status")
    private int mobile_code_status;//用户注册状态
    @SerializedName("total_read")
    private String total_read;//总阅读数

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getInvite_code() {
        return invite_code;
    }

    public void setInvite_code(String invite_code) {
        this.invite_code = invite_code;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getRegister_time() {
        return register_time;
    }

    public void setRegister_time(String register_time) {
        this.register_time = register_time;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getMobile_code_status() {
        return mobile_code_status;
    }

    public void setMobile_code_status(int mobile_code_status) {
        this.mobile_code_status = mobile_code_status;
    }

    public String getTotal_read() {
        return total_read;
    }

    public void setTotal_read(String total_read) {
        this.total_read = total_read;
    }
}
