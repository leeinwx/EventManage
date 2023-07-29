package com.cs.eventmanage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dao.EventDao;
import com.cs.eventmanage.dto.session.BigClassInfo;
import com.cs.eventmanage.service.EventClassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class EventClassServiceImpl implements EventClassService {

    @Autowired
    private EventDao eventDao;

    @Override
    public List<String> getAllType() {
        return eventDao.getAllType();
    }

    @Override
    public List<BigClassInfo> getEventClass(String type) {
        if (type == null || type.length() == 0) {
            return eventDao.getEventClass();
        }
        return eventDao.getEventClassWithParam(type);
    }

    @Override
    public void addClass(JSONObject requestJson) {
        String className = requestJson.getString("className");
        String eventType = requestJson.getString("eventType");
        String uuid = UUID.randomUUID().toString();
        eventDao.addClass(uuid, className, eventType);
    }

    @Override
    public void updateClass(JSONObject requestJson) {
        String classId = requestJson.getString("classId");
        String className = requestJson.getString("className");
        String eventType = requestJson.getString("eventType");
        Integer status = requestJson.getInteger("status");
        eventDao.updateClass(classId, className, eventType, status);
    }
}
