package com.cs.eventmanage.service.impl;

import com.cs.eventmanage.dao.DashBoardDao;
import com.cs.eventmanage.dto.session.EventCheckInfo;
import com.cs.eventmanage.dto.session.MapInfo;
import com.cs.eventmanage.service.DashBoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DashBoardServiceImpl implements DashBoardService {

    @Autowired
    private DashBoardDao dashBoardDao;

    @Override
    public List<EventCheckInfo> getBasic() {
        return dashBoardDao.getBasic();
    }

    @Override
    public List<MapInfo> getMapInfo() {
        return dashBoardDao.getMapInfo();
    }
}
