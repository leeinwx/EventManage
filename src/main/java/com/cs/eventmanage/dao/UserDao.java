package com.cs.eventmanage.dao;

import com.cs.eventmanage.dto.session.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<UserInfo> getUserList();

}
