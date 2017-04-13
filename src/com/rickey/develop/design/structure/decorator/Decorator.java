package com.rickey.develop.design.structure.decorator;

/**
 * Created by Rickey_17 on 17-4-2.
 * 装饰器模式的应用场景：

 1、需要扩展一个类的功能。

 2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
