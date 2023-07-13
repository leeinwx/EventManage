package com.cs.eventmanage.dao;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dto.session.SessionUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

@Mapper
public interface LoginDao {

    //login check
    Integer checkUser(@Param("username") String username, @Param("password") String password);

    //only admin account can add user
    void addUser(@Param("username") String username, @Param("password") String password);

    //get all available users except admin account
    List<String> getAvailableUsers();

    SessionUserInfo getUserInfo(String username);

    Set<String> getAllMenu();

    Set<String> getAllPermissionCode();

}
