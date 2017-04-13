package com.rickey.develop.design.create.staticFactory;

import com.rickey.develop.design.create.factory.MailSender;
import com.rickey.develop.design.create.factory.Sender;
import com.rickey.develop.design.create.factory.SmsSender;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class StaticFactory {

    public static Sender produceMail(){

        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }

}
