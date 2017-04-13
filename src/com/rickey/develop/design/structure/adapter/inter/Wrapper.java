package com.rickey.develop.design.structure.adapter.inter;

/**
 * Created by Rickey_17 on 17-4-2.
 * 接口的适配器模式：当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
 */
public abstract class Wrapper implements Targetable {

    public void method1(){}

    public void method2(){}
}
