package com.rickey.develop.design;

/**
 * Created by xq on 17-3-18.
 */
public class Test {

    public static void main(String[] args){
        System.out.println(foo(5));
    }

    private static int foo(int n){
        if(n<=2)
            return n;
        return foo(n-1)+foo(n-2);
    }
}
