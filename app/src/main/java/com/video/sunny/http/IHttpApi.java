package com.video.sunny.http;

import com.video.sunny.entity.user.request.UserLoginReq;
import com.video.sunny.entity.user.resp.UserLoginResp;

import retrofit2.http.Body;
import rx.Observable;

/**
 * Created by liu on 16/8/4.
 */
public interface IHttpApi {

    /**
     * 登录
     * @param userLoginReq
     * @return
     */
    Observable<UserLoginResp> login(@Body UserLoginReq userLoginReq);
}
