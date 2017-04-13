package com.rickey.develop.design.behavior.parentChild.strategy;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class Multiply extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\*");
        return arrayInt[0]*arrayInt[1];
    }

}
