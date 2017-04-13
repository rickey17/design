package com.rickey.develop.design.create.singleton;

import java.io.Serializable;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class SingletonHungry implements Serializable {

    private static final long serialVersionUID = 1521141977099137091L;

    private static class SingletonHolder{
        private static final SingletonHungry instance = new SingletonHungry();
    }

    public static final SingletonHungry getSingleton(){
        return SingletonHolder.instance;
    }

    /* 私有构造方法，防止被实例化 */
    private SingletonHungry(){}

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getSingleton();
    }
}
