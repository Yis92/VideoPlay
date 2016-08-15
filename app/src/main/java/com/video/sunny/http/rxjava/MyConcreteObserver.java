package com.video.sunny.http.rxjava;

import java.util.HashMap;
import java.util.Map;

/**
 * 观察者调度器
 * @author liu
 */
public class MyConcreteObserver implements MyConcreteSubject, MyObserver {

    /**
     * 目标缓存
     */
    private Map<String, Map<String, MyConcreteSubject>> observerMap = new HashMap<>();

    /**
     * 添加目标
     *
     * @param concreteSubject 目标
     * @param keyPath         目标中某个属性key(目标中需要观察的属性)
     */
    @Override
    public void addObserver(MyConcreteSubject concreteSubject, String keyPath) {
        //根据keyPath获取目标map
        Map<String, MyConcreteSubject> map = this.observerMap.get(keyPath);
        // 目标缓存为空时，初始化
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(concreteSubject.getClass().getName(), concreteSubject);// 存入map
        this.observerMap.put(keyPath, map);// 放到缓存中
    }

    /**
     * 通知目标
     *
     * @param keyPath 目标中某个属性key(目标中需要观察的属性)
     * @param object  观察者
     */
    @Override
    public void observeValueForKeyPath(String keyPath, Object object) {
        Map<String, MyConcreteSubject> map = this.observerMap.get(keyPath);
        if (map != null) {
            // 便利map，通知所有目标
            for (MyConcreteSubject subject : map.values()) {
                subject.observeValueForKeyPath(keyPath, object);
            }
        }
    }

}
