package com.xgm.ninja.controller;

import com.xgm.ninja.bean.UserBean;
import com.xgm.ninja.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController{
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserByName")
    @ResponseBody
    public Object getUserByName(HttpServletRequest request) {
        System.err.println("== UserController == getUserByName ==");
        //String username = request.getParameter("username");
        String username = "xiaoming";
        UserBean user = userService.getUserByName(username);
        System.err.println(user.toString());
        return user;
    }
}
