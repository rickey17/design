package com.rickey.develop.design.behavior.parentChild.template;

/**
 * Created by Rickey_17 on 17-4-2.
 */
public class TemplateTest {

    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }

}
