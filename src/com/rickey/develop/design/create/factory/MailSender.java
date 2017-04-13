package com.rickey.develop.design.create.factory;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
