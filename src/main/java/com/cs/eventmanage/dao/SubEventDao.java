package com.cs.eventmanage.dao;

import com.cs.eventmanage.dto.session.SubClassInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SubEventDao {

    List<SubClassInfo> getAllEventSubClass();

    List<SubClassInfo> getEventSubClass(@Param("classId") String classId);

    void addEventSubClass(@Param("classId") String classId, @Param("subClassId") String subClassId, @Param("subClassName") String subClassName);

    void updateEventSubClass(@Param("classId") String classId, @Param("subClassId") String subClassId, @Param("subClassName") String subClassName, @Param("status") Integer status);

}
