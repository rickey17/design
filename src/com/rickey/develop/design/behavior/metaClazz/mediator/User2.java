package com.rickey.develop.design.behavior.metaClazz.mediator;

/**
 * Created by Rickey_17 on 17-4-2.
 */

public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
