package com.xgm.ninja.strategypattern;

/**
 * @author xu.guangming
 * @desc 打折算法1，实现策略类打折方法
 *      具体策略类，封装具体算法或行为
 * @date 2019/11/7 16:39
 * @modified by
 */
public class DiscountStrategy1 implements Strategy {

    @Override
    public String discountAlgorithm() {
        return "DiscountStrategy1";
    }
}
