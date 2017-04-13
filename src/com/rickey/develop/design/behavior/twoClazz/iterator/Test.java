package com.rickey.develop.design.behavior.twoClazz.iterator;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class Test {

    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
