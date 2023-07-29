package com.cs.eventmanage.dao;

import com.cs.eventmanage.dto.session.EventOperateInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EventUserDao {

    List<EventOperateInfo> getInfo();

    List<EventOperateInfo> getInfoWithParam(@Param("subClassId") String subClassId);

    void addUserEvent(@Param("userId") String userId, @Param("subClassId") String subClassId, @Param("operate") String operate);

    void editUserEvent(@Param("userId") String userId, @Param("subClassId") String subClassId, @Param("operate") String operate, @Param("status") Integer status);

}
