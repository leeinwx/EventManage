package com.cs.eventmanage.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LoginDao {

    //login check
    Integer checkUser(@Param("username") String username, @Param("password") String password);

    //only admin account can add user
    void addUser(@Param("username") String username, @Param("password") String password);

    //get all available users except admin account
    List<String> getAvailableUsers();

}
