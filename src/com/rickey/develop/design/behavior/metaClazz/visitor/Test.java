package com.rickey.develop.design.behavior.metaClazz.visitor;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class Test {
    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
