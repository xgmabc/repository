package com.xgm.ninja.strategypattern;

/**
 * @author xu.guangming
 * @desc 客户端代码
 *      通过对Context的getDiscountAlgorithm方法的调用，
 *      可以得到收取费用的结果，让具体算法与客户进行了隔离
 * @date 2019/11/7 17:04
 * @modified by
 */
public class StrategyView {

    public static void main(String[] args) {
        // 客户端只认识context类就可以了
        // 相比较简单工厂模式，更解耦合
        Context context1 = new Context(1);
        String discountAlgorithm1 = context1.getDiscountAlgorithm();
        System.out.println(discountAlgorithm1);

        System.out.println(new Context(2).getDiscountAlgorithm());
        System.out.println(new Context(3).getDiscountAlgorithm());
    }
}
