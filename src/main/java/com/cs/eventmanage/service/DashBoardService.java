package com.cs.eventmanage.service;

import com.cs.eventmanage.dto.session.EventCheckInfo;
import com.cs.eventmanage.dto.session.MapInfo;

import java.util.List;

public interface DashBoardService {

    List<EventCheckInfo> getBasic();

    List<MapInfo> getMapInfo();

}
