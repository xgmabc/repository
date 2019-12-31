package com.xgm.ninja.simplefactorypattern;

/**
 * @author xu.guangming
 * @desc 解耦合：将计算器界面逻辑独立封装，与计算器类解耦合
 * @date 2019/11/6 14:21
 * @modified by
 */
public class OperationView {

    public static Double getResult(Double num1, Double num2, String operator) {
        // 客户端需要认识工厂类和操作类
        Operation operationInstance = OperationSimpleFactory.getOperationInstance(operator);
        operationInstance.setNum1(num1);
        operationInstance.setNum2(num2);
        return operationInstance.getRes();
    }

    public static void main(String[] args) {
        Double add = getResult(4.5, 2.3, "+");
        Double sub = getResult(4.5, 2.3, "-");
        Double multi = getResult(4.5, 2.3, "*");
        Double di = getResult(4.5, 2.3, "/");
        System.out.println("======加====== " + add);
        System.out.println("======减====== " + sub);
        System.out.println("======乘====== " + multi);
        System.out.println("======除====== " + di);
    }
}
