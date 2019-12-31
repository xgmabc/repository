package com.xgm.ninja.abstractfactorypattern.service;

/**
 * @author xu.guangming
 * @desc
 * @date 2019/12/6 15:11
 * @modified by
 */
public class DeptMySql implements Dept {
    @Override
    public void insertOneDept() {
        System.err.println("insert one Mysql dept");
    }

    @Override
    public void getOneDept() {
        System.err.println("get one Mysql dept");
    }
}
