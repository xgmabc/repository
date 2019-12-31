package com.xgm.ninja.factorymethodpattern.opeartion;

/**
 * @author xu.guangming
 * @desc 继承：除法类
 * @date 2019/11/6 13:47
 * @modified by
 */
public class OperationDivision extends Operation {

    @Override
    public double getRes() {
        double res = 0D;
        try{
            if(num2 == 0) {
                throw new Exception("除数不能为0");
            }
            res = num1 / num2;
        } catch(Exception e) {
            e.getStackTrace();
        } finally {
        }
        return res;
    }
}
