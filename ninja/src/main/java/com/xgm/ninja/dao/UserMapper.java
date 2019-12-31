package com.xgm.ninja.dao;

import com.xgm.ninja.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    UserBean getUserByName(String username);
}
