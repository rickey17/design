package com.rickey.develop.design.behavior.twoClazz.observer;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
