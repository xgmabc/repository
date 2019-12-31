package com.xgm.ninja.abstractfactorypattern.factory;

import com.xgm.ninja.abstractfactorypattern.service.Dept;
import com.xgm.ninja.abstractfactorypattern.service.User;
import org.springframework.util.StringUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author xu.guangming
 * @desc
 * @date 2019/12/6 15:23
 * @modified by
 */
public class AbstractFactory {

    private static final String PRO_URL = "D:\\codes\\ninja\\src\\main\\java\\com\\xgm\\ninja\\abstractfactorypattern\\factory\\dbType.properties";
    private static final String BASE_PACKAGE = "com.xgm.ninja.abstractfactorypattern.service.";
    private static final String USER_CLASS_NAME = "User";
    private static final String DEPT_CLASS_NAME = "Dept";
    private static Properties property = new Properties();
    private static String dbType;

    static{
        try {
            property.load(new FileInputStream(PRO_URL));
            dbType = property.getProperty("dbType");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static User getUserInstance() {
        try{
            if (!StringUtils.isEmpty(dbType)) {
                Class<?> userClass = Class.forName(BASE_PACKAGE + USER_CLASS_NAME + dbType);
                User user = (User)userClass.newInstance();
                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return null;
    }

    public static Dept getDeptInstance() {
        try{
            if (!StringUtils.isEmpty(dbType)) {
                Class<?> deptClass = Class.forName(BASE_PACKAGE + DEPT_CLASS_NAME + dbType);
                Dept dept = (Dept)deptClass.newInstance();
                return dept;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return null;
    }
}
