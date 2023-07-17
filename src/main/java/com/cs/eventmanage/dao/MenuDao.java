package com.cs.eventmanage.dao;

import com.cs.eventmanage.dto.session.MenuInfo;
import com.cs.eventmanage.dto.session.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuDao {

    List<MenuInfo> getMenuList();

    List<UserInfo> getUserList();

    void addMenuPermission(@Param("menuCode") String menuCode, @Param("userList") List<String> userList);

}
