package com.rickey.develop.design.create.factory;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class MultiFactoryTest {

    public static void main(String[] args) {
        MultiSendFactory factory = new MultiSendFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }

}
