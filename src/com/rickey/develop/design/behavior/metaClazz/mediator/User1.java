package com.rickey.develop.design.behavior.metaClazz.mediator;

/**
 * Created by Rickey_17 on 17-4-2.
 */

public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}

