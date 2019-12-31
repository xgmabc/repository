package com.xgm.ninja.factorymethodpattern.opeartion;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xu.guangming
 * @desc 封装操作基类
 * @date 2019/11/28 15:23
 * @modified by
 */
public class Operation {

    @Setter
    @Getter
    protected double num1 = 0D;
    @Setter
    @Getter
    protected double num2 = 0D;

    // 不写修饰符，默认default，本包可见
    // protected，本包及继承类可见
    public double getRes() {
        double res = 0D;
        return res;
    }
}
