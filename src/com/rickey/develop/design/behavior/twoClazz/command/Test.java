package com.rickey.develop.design.behavior.twoClazz.command;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class Test {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
