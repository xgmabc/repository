package com.xgm.ninja.abstractfactorypattern.service;

/**
 * @author xu.guangming
 * @desc
 * @date 2019/12/6 15:11
 * @modified by
 */
public class UserOracle implements User {
    @Override
    public void insertOneUser() {
        System.err.println("insert one Oracle user");
    }

    @Override
    public void getOneUser() {
        System.err.println("get one Oracle user");
    }
}
