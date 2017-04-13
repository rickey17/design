package com.rickey.develop.design.create.singleton;

import java.io.Serializable;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class SingletonLazy implements Serializable {

    private static final long serialVersionUID = 7966775974463378841L;

    private volatile static SingletonLazy instance = null;

    /* 私有构造方法，防止被实例化 */
    private SingletonLazy(){}

    public static SingletonLazy getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null)
                    instance = new SingletonLazy();
            }
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}
