package com.rickey.develop.design.behavior.metaClazz.mediator;

/**
 * Created by Rickey_17 on 17-4-2.
 */

public abstract class User {

    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}

