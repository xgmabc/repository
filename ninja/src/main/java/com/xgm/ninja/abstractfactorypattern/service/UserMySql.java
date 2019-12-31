package com.xgm.ninja.abstractfactorypattern.service;

/**
 * @author xu.guangming
 * @desc
 * @date 2019/12/6 15:10
 * @modified by
 */
public class UserMySql implements User {
    @Override
    public void insertOneUser() {
        System.err.println("insert one Mysql user");
    }

    @Override
    public void getOneUser() {
        System.err.println("get one Mysql user");
    }
}
