package com.cs.eventmanage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dao.EventDao;
import com.cs.eventmanage.dto.session.BigClassInfo;
import com.cs.eventmanage.service.EventClassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EventClassServiceImpl implements EventClassService {

    @Autowired
    private EventDao eventDao;

    @Override
    public List<BigClassInfo> getEventClass() {
        return eventDao.getEventClass();
    }

    @Override
    public void addClass(JSONObject requestJson) {
        String className = requestJson.getString("className");
        String eventType = requestJson.getString("eventType");
        //todo
        String uuid = "1111";
        eventDao.addClass(uuid, className, eventType);
    }
}
