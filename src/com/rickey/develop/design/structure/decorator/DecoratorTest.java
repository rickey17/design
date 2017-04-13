package com.rickey.develop.design.structure.decorator;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }

}
