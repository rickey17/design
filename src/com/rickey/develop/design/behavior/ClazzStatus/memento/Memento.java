package com.rickey.develop.design.behavior.ClazzStatus.memento;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
