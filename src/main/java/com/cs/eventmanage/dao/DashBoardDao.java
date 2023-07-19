package com.cs.eventmanage.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DashBoardDao {

    void check(@Param("username") String username, @Param("eventType") String eventType, @Param("page") Integer page);

}
