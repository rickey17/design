package com.rickey.develop.design.behavior.metaClazz.interpreter;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class Test {
    public static void main(String[] args) {

        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
