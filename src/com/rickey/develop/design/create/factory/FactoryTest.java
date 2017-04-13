package com.rickey.develop.design.create.factory;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.send();
    }

}
