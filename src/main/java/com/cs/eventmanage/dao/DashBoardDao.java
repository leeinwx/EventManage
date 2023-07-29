package com.cs.eventmanage.dao;

import com.cs.eventmanage.dto.session.EventCheckInfo;
import com.cs.eventmanage.dto.session.MapInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DashBoardDao {

    List<EventCheckInfo> getBasic();

    List<MapInfo> getMapInfo();

}
