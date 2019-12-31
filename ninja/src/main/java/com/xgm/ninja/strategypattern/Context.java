package com.xgm.ninja.strategypattern;

/**
 * @author xu.guangming
 * @desc Context上下文，用一个DiscountStrategy来配置，维护一个对Strategy对象的引用
 * @date 2019/11/7 16:41
 * @modified by
 */
public class Context {

    private Strategy strategy;

    // 初始化时，传入具体的策略对象
    // 简单工厂类的应用
    public Context(int i) {
        switch (i) {
            case 1:
                strategy = new DiscountStrategy1();  // 多态？
                break;
            case 2:
                strategy = new DiscountStrategy2();
                break;
            case 3:
                strategy = new DiscountStrategy3();
                break;
        }
    }

    // 根据具体的策略对象，调用其算法的方法
    public String getDiscountAlgorithm() {
        if(strategy != null){
            return strategy.discountAlgorithm();
        }
        return "";
    }
}
