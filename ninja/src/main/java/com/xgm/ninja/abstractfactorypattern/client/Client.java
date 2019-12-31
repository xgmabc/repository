package com.xgm.ninja.abstractfactorypattern.client;

import com.xgm.ninja.abstractfactorypattern.factory.AbstractFactory;
import com.xgm.ninja.abstractfactorypattern.service.Dept;
import com.xgm.ninja.abstractfactorypattern.service.User;

/**
 * @author xu.guangming
 * @desc
 * @date 2019/12/6 16:06
 * @modified by
 */
public class Client {
    public static void main(String[] args) {
        Dept deptInstance = AbstractFactory.getDeptInstance();
        deptInstance.insertOneDept();

        User userInstance = AbstractFactory.getUserInstance();
        userInstance.getOneUser();

    }
}
