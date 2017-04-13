package com.rickey.develop.design.behavior.twoClazz.iterator;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public interface Iterator {

    //前移
    Object previous();

    //后移
    Object next();

    boolean hasNext();

    //取得第一个元素
    Object first();
}
