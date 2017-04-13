package com.rickey.develop.design.create.factory;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class MultiSendFactory {

    public Sender produceMail(){

        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }

}
