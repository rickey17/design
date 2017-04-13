package com.rickey.develop.design.structure.adapter.inter;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class WrapperTest {

    public static void main(String[] args) {
        Targetable source1 = new SourceSub1();
        Targetable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }

}
