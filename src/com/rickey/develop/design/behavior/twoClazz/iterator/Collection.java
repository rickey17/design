package com.rickey.develop.design.behavior.twoClazz.iterator;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public interface Collection {

    Iterator iterator();

    /*取得集合元素*/
    Object get(int i);

    /*取得集合大小*/
    int size();
}
