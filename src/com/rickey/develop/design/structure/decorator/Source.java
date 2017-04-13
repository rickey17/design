package com.rickey.develop.design.structure.decorator;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
