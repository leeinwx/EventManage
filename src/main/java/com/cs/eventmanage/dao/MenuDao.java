package com.cs.eventmanage.dao;

import com.cs.eventmanage.dto.session.MenuInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuDao {

    List<MenuInfo> getMenuList();

    void addMenuPermission(@Param("menuCode") String menuCode, @Param("userId") String userId);

}
