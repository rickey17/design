package com.rickey.develop.design.behavior.twoClazz.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Rickey_17 on 17-4-2.
 * 当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> vector = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while(enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }
}
