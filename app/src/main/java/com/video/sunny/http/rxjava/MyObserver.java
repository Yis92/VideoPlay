package com.video.sunny.http.rxjava;

/**
 *观察者
 * @author liu
 */
public interface MyObserver {

    /**
     * 添加目标
     *
     * @param concreteSubject 目标
     * @param keyPath         目标中某个属性key(目标中需要观察的属性)
     */
    void addObserver(MyConcreteSubject concreteSubject, String keyPath);
}
