package com.cs.eventmanage.dao;

import com.cs.eventmanage.dto.session.BigClassInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EventDao {

    List<String> getAllType();

    List<BigClassInfo> getEventClass();

    List<BigClassInfo> getEventClassWithParam(@Param("type") String type);

    void addClass(@Param("classId") String classId, @Param("className") String className, @Param("eventType") String eventType);

    void updateClass(@Param("classId") String classId, @Param("className") String className, @Param("eventType") String eventType, @Param("status") Integer status);

}
