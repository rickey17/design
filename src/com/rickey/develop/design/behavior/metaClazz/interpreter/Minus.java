package com.rickey.develop.design.behavior.metaClazz.interpreter;

/**
 * Created by Rickey_17 on 17-4-2.
 */

public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
