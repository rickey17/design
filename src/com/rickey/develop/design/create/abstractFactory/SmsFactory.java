package com.rickey.develop.design.create.abstractFactory;

import com.rickey.develop.design.create.factory.Sender;
import com.rickey.develop.design.create.factory.SmsSender;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class SmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
