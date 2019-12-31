package com.xgm.ninja.simplefactorypattern;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xu.guangming
 * @desc 封装特性：封装计算器基类
 * @date 2019/11/6 13:40
 * @modified by
 */
@Setter
@Getter
public class Operation {

    protected double num1 = 0D;
    protected double num2 = 0D;

    double getRes(){
        double res = 0D;
        return res;
    }

}
