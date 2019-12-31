package com.xgm.ninja.service;

import com.xgm.ninja.bean.UserBean;
import com.xgm.ninja.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean getUserByName(String username) {
        System.err.println("UserServiceImpl in");
        return userMapper.getUserByName(username);
    }
}
