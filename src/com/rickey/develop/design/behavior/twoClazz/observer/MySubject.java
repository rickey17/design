package com.rickey.develop.design.behavior.twoClazz.observer;

/**
 * Created by Rickey_17 on 17-4-2.
 */

public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

}

