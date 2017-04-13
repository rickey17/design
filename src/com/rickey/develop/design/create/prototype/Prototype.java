package com.rickey.develop.design.create.prototype;

import java.io.*;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class Prototype implements Cloneable , Serializable {

    private static final long serialVersionUID = 3953837424916969687L;

    private String string;

    /* 浅复制 */
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    /* 深复制 */
    public Object deepClone() throws IOException , ClassNotFoundException{

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(bo);
        os.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return oi.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
