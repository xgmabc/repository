package com.xgm.ninja.factorymethodpattern.operationclient;

import com.xgm.ninja.factorymethodpattern.factory.OperationAdditionFactory;
import com.xgm.ninja.factorymethodpattern.factory.OperationFactory;
import com.xgm.ninja.factorymethodpattern.opeartion.Operation;

/**
 * @author xu.guangming
 * @desc 操作类客户端
 * @date 2019/11/28 15:36
 * @modified by
 */
public class OperationView {

    public static void main(String[] args) {
        OperationFactory additionFactory = new OperationAdditionFactory();  // 获取加法工厂类，多态
        Operation additionOperation = additionFactory.getOperation();       // 由工厂类获取对应的操作类

        additionOperation.setNum1(2.5D);
        additionOperation.setNum2(4.5D);
        double res = additionOperation.getRes();                            // 由操作类调取具体子类实现，实现业务需求

        System.err.println(res);
    }
}
