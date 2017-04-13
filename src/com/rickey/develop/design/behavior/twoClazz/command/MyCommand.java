package com.rickey.develop.design.behavior.twoClazz.command;

/**
 * Created by Rickey_17 on 17-4-2.
 */

public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
