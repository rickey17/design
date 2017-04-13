package com.rickey.develop.design.create.staticFactory;

import com.rickey.develop.design.create.factory.Sender;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class StaticFactoryTest {

    public static void main(String[] args){
        Sender sender = StaticFactory.produceMail();
        sender.send();
    }

}
