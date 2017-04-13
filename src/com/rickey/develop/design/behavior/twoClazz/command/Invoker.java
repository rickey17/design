package com.rickey.develop.design.behavior.twoClazz.command;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
