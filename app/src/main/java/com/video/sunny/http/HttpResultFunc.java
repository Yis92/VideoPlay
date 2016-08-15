package com.video.sunny.http;

import com.video.sunny.entity.BaseEntity;
import com.video.sunny.exception.ApiException;

import rx.functions.Func1;

/**
 * 接口返回信息校验
 * Created by liu on 16/8/4.
 */
public class HttpResultFunc<T> implements Func1<BaseEntity<T>,T>{


    @Override
    public T call(BaseEntity<T> tBaseEntity) {
        //服务器
        if (tBaseEntity.getStatus() != 200){
            throw new ApiException(tBaseEntity.getMessage());
        }

        T data =tBaseEntity.getData();
        if (data == null) {
            return (T) tBaseEntity;
        }else {
            return data;
        }
    }
}
