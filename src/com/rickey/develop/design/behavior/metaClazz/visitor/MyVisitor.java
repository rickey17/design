package com.rickey.develop.design.behavior.metaClazz.visitor;

/**
 * Created by Rickey_17 on 17-4-2.
 */

public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}

