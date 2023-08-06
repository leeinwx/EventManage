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

    //todo subclassid

    @Override
    public void addInfo(JSONObject requestJson) {
        String subClassId = requestJson.getString("subClassId");
        String content = requestJson.getString("content");
        String classLocationId = requestJson.getString("classLocationId");
        String classOccurDate = requestJson.getString("classOccurDate");
        eventDetailDao.addInfo(subClassId, content);
        eventDetailDao.addPropertiesInfo(subClassId, classLocationId, classOccurDate);
    }

    @Override
    public void editInfo(JSONObject requestJson) {
        String subClassId = requestJson.getString("subClassId");
        String content = requestJson.getString("content");
        String status = requestJson.getString("status");
        String classLocationId = requestJson.getString("classLocationId");
        String classOccurDate = requestJson.getString("classOccurDate");
        eventDetailDao.editInfo(subClassId, content, status);
        eventDetailDao.editPropertiesInfo(subClassId, classLocationId, classOccurDate, status);
    }
}
