package com.cs.eventmanage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dao.EventDetailDao;
import com.cs.eventmanage.service.EventDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EventDetailServiceImpl implements EventDetailService {

    @Autowired
    private EventDetailDao eventDetailDao;

    @Override
    public void addInfo(JSONObject requestJson) {
        String subClassId = requestJson.getString("subClassId");
        String content = requestJson.getString("content");
        eventDetailDao.addInfo(subClassId, content);
    }

    @Override
    public void editInfo(JSONObject requestJson) {
        String subClassId = requestJson.getString("subClassId");
        String content = requestJson.getString("content");
        String status = requestJson.getString("status");
        eventDetailDao.editInfo(subClassId, content, status);
    }
}
