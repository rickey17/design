package com.rickey.develop.design.behavior.metaClazz.mediator;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
