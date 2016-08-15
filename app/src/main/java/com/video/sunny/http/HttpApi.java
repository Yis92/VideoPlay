package com.video.sunny.http;

import com.video.sunny.entity.user.request.UserLoginReq;
import com.video.sunny.entity.user.resp.UserLoginResp;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import rx.Observable;

/**
 * 服务器请求工具类
 * Created by liu on 16/8/4.
 */
public class HttpApi implements IHttpApi{

    public static final String BASE_URL = URLConstants.SERVER_URL;
    private static final int DEFAULT_TIMEOUT = 5;
    private Retrofit retrofit;

    private Api api;

    private static HttpApi ourInstance = new HttpApi();

    public static HttpApi getInstance() {
        return ourInstance;
    }

    private HttpApi() {
        //创建一个OkHttpClient并设置超时时间
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        retrofit = new Retrofit.Builder()
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();
        api = retrofit.create(Api.class);
    }

    /**
     * 登录
     * @param userLoginReq
     * @return
     */
    @Override
    public Observable<UserLoginResp> login(@Body UserLoginReq userLoginReq) {
        return api.login(userLoginReq).map(new HttpResultFunc<UserLoginResp>());
    }
}
