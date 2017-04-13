package com.rickey.develop.design.structure.adapter.clazz;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
