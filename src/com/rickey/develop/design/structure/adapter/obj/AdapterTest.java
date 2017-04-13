package com.rickey.develop.design.structure.adapter.obj;

import com.rickey.develop.design.structure.adapter.clazz.Source;
import com.rickey.develop.design.structure.adapter.clazz.Targetable;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }

}
