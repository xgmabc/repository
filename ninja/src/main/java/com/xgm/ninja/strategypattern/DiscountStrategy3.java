package com.xgm.ninja.strategypattern;

/**
 * @author xu.guangming
 * @desc 打折算法3，实现策略类打折方法
 * @date 2019/11/7 16:39
 * @modified by
 */
public class DiscountStrategy3 implements Strategy {

    @Override
    public String discountAlgorithm() {
        return "DiscountStrategy3";
    }
}
