package com.xgm.ninja.factorymethodpattern.opeartion;

/**
 * @author xu.guangming
 * @desc 继承：乘法类
 * @date 2019/11/6 13:47
 * @modified by
 */
public class OperationMultiplication extends Operation {

    @Override
    public double getRes() {
        return num1 * num2;
    }
}
