package com.video.sunny.http.rxjava;

/**
 * 被观察的目标
 * @author liu
 */
public interface MyConcreteSubject {

    /**
     * 观察者中属性改变时，通知目标
     *
     * @param keyPath 目标中某个属性key(目标中需要观察的属性)
     * @param object  观察者
     */
     void observeValueForKeyPath(String keyPath, Object object);

}
