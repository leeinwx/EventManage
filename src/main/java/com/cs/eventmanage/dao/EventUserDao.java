package com.cs.eventmanage.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EventUserDao {

    void addUserEvent(@Param("userId") String userId, @Param("subClassId") String subClassId, @Param("operate") String operate);

    void editUserEvent(@Param("userId") String userId, @Param("subClassId") String subClassId, @Param("operate") String operate, @Param("status") Integer status);

}
