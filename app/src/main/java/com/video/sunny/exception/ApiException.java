package com.video.sunny.exception;

/**
 * Created by liukun on 16/3/10.
 */
public class ApiException extends RuntimeException {

    /** 登出 */
    public static final int CODE_LOGOUT = 999;

    private int resultCode = -1;


    /**
     * 构建错误信息
     *
     * @param resultCode    状态码
     * @param detailMessage 错误信息
     */
    public ApiException(int resultCode, String detailMessage) {
        super(detailMessage);
        this.resultCode = resultCode;
    }

    /**
     * 构建错误信息
     *
     * @param detailMessage 错误信息
     */
    public ApiException(String detailMessage) {
        super(detailMessage);
    }


}

