package com.rickey.develop.design.behavior.parentChild.strategy;

/**
 * Created by Rickey_17 on 17-4-2.
 * 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户
 */
public interface ICalculator {

    int calculate(String exp);

}
