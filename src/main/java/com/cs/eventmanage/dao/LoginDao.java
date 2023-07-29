package com.cs.eventmanage.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginDao {

    //only admin account can add user
    void addUser(@Param("username") String username, @Param("password") String password, @Param("userId") String userId);

    String getRandomPassword();

}
