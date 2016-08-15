package com.video.sunny.entity;

import com.google.gson.annotations.SerializedName;

/**
 * <p>Description: 服务器返回基类</p>
 *
 * @author liuyi
 */
public class BaseEntity<T> {
    @SerializedName("status")
    private int status;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private T data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }
}
