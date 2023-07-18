package com.cs.eventmanage.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EventDetailDao {

    void addInfo(@Param("subClassId") String subClassId, @Param("content") String content);

    void editInfo(@Param("subClassId") String subClassId, @Param("content") String content, @Param("status") String status);

}
