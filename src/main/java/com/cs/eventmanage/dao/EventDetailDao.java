package com.cs.eventmanage.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EventDetailDao {

    void addInfo(@Param("subClassId") String subClassId, @Param("content") String content);

    void addPropertiesInfo(@Param("subClassId") String subClassId, @Param("classLocationId") String classLocationId, @Param("classOccurDate") String classOccurDate);

    void editInfo(@Param("subClassId") String subClassId, @Param("content") String content, @Param("status") String status);

    void editPropertiesInfo(@Param("subClassId") String subClassId, @Param("classLocationId") String classLocationId, @Param("classOccurDate") String classOccurDate, @Param("status") String status);

}
