package com.rickey.develop.design.create.abstractFactory;

import com.rickey.develop.design.create.factory.Sender;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public interface Provider {

    Sender produce();
}
