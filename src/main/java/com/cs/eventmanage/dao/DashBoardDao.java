package com.cs.eventmanage.dao;

import com.cs.eventmanage.dto.session.EventCheckInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DashBoardDao {

    List<EventCheckInfo> getBasic();

    void check(@Param("username") String username, @Param("eventType") String eventType, @Param("page") Integer page);

}
