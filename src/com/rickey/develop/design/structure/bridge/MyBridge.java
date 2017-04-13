package com.rickey.develop.design.structure.bridge;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class MyBridge extends Bridge {

    public void method(){
        getSource().method();
    }

}
