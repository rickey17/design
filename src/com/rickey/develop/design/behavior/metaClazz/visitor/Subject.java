package com.rickey.develop.design.behavior.metaClazz.visitor;

/**
 * Created by Rickey_17 on 17-4-2.
 */

public interface Subject {
    void accept(Visitor visitor);
    String getSubject();
}

