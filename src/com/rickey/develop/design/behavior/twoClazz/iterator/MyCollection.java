package com.rickey.develop.design.behavior.twoClazz.iterator;

/**
 * Created by Rickey_17 on 17-4-2.
 */

public class MyCollection implements Collection {

    public String string[] = {"A","B","C","D","E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}

