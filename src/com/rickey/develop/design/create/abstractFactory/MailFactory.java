package com.rickey.develop.design.create.abstractFactory;

import com.rickey.develop.design.create.factory.MailSender;
import com.rickey.develop.design.create.factory.Sender;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class MailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
