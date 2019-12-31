package com.xgm.ninja.simplefactorypattern;

/**
 * @author xu.guangming
 * @desc 继承：乘法类
 * @date 2019/11/6 13:47
 * @modified by
 */
public class OperationSubstruction extends Operation {

    @Override
    double getRes() {
        return Math.abs(num1 - num2);
    }
}
