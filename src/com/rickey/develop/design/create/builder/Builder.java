package com.rickey.develop.design.create.builder;

import com.rickey.develop.design.create.factory.MailSender;
import com.rickey.develop.design.create.factory.Sender;
import com.rickey.develop.design.create.factory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }
}
