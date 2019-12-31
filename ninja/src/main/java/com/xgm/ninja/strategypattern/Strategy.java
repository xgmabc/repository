package com.xgm.ninja.strategypattern;

/**
 * @author xu.guangming
 * @desc 策略类：商品优惠算法接口
 *      策略类，定义所有支持的算法的公共接口
 * @date 2019/11/7 16:34
 * @modified by
 */
public interface Strategy {

    String discountAlgorithm();
}
