package com.rickey.develop.design.structure.proxy;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class ProxyTest {

    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}
