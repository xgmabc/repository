package com.xgm.ninja.factorymethodpattern.factory;

import com.xgm.ninja.factorymethodpattern.opeartion.Operation;
import com.xgm.ninja.factorymethodpattern.opeartion.OperationAddition;
import com.xgm.ninja.factorymethodpattern.opeartion.OperationSubstruction;

/**
 * @author xu.guangming
 * @desc 减法操作类工厂
 * @date 2019/11/28 15:30
 * @modified by
 */
public class OperationSubstructionFactory implements OperationFactory {

    @Override
    public Operation getOperation() {
        return new OperationSubstruction();
    }
}
