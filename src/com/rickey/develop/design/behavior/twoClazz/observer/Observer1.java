package com.rickey.develop.design.behavior.twoClazz.observer;

/**
 * Created by Rickey_17 on 17-4-2.
 */

public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}

