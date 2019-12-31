package com.xgm.ninja.simplefactorypattern;

import org.springframework.util.StringUtils;

/**
 * @author xu.guangming
 * @desc 简单工厂模式 & 多态：根据运算符号，工厂实例化对应的运算类，多态返回结果
 * @date 2019/11/6 14:08
 * @modified by
 */
public class OperationSimpleFactory {

    public static Operation getOperationInstance(String operator) {
        Operation operation = null;
        try {
            if(StringUtils.isEmpty(operator)) {
                throw new Exception("运算符不能为空");
            }
            switch(operator) {
                case "+":
                    operation = new OperationAddition();
                    break;
                case "-":
                    operation = new OperationSubstruction();
                    break;
                case "*":
                    operation = new OperationMultiplication();
                    break;
                case "/":
                    operation = new OperationDivision();
                    break;
                default:
                    break;
            }
        } catch(Exception e) {
            e.getStackTrace();
        } finally {
        }
        return operation;
    }
}
