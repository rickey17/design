package com.rickey.develop.design.behavior.metaClazz.visitor;

/**
 * Created by Rickey_17 on 17-4-2.
 */

public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}

