package com.xgm.ninja.factorymethodpattern.factory;

import com.xgm.ninja.factorymethodpattern.opeartion.Operation;

/**
 * @author xu.guangming
 * @desc 工厂方法模式，工厂接口
 * @date 2019/11/28 15:22
 * @modified by
 */
public interface OperationFactory {

    Operation getOperation();
}
