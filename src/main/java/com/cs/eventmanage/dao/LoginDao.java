package com.cs.eventmanage.dao;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dto.session.SessionUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

@Mapper
public interface LoginDao {

    JSONObject checkUser(@Param("username") String username, @Param("password") String password);

    SessionUserInfo getUserInfo(String username);

    Set<String> getAllMenu();

    Set<String> getAllPermissionCode();

}
