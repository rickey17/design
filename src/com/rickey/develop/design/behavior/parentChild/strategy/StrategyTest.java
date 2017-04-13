package com.rickey.develop.design.behavior.parentChild.strategy;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class StrategyTest {

    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }

}
