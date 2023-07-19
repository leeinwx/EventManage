package com.cs.eventmanage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dao.DashBoardDao;
import com.cs.eventmanage.service.DashBoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DashBoardServiceImpl implements DashBoardService {

    @Autowired
    private DashBoardDao dashBoardDao;

    @Override
    public void check(JSONObject requestJson) {
        Integer page = requestJson.getInteger("page");
        String username = null;
        String eventType = null;
        if (requestJson.containsKey("username")) {
            username = requestJson.getString("username");
        }
        if (requestJson.containsKey("eventType")) {
            eventType = requestJson.getString("eventType");
        }
        //class_id
        //class_name
        //event_type
        //subclass_id
        //subclass_name
        //class_location_id city_id
        //province
        //city_name
        //class_occur_date occur_date
        //content
        //user_id
        //username
        //operate
        dashBoardDao.check(username, eventType, page);
    }
}
