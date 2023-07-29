package com.cs.eventmanage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dao.EventUserDao;
import com.cs.eventmanage.dto.session.EventOperateInfo;
import com.cs.eventmanage.service.EventUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EventUserServiceImpl implements EventUserService {

    @Autowired
    private EventUserDao eventUserDao;

    @Override
    public List<EventOperateInfo> getInfo(String subClassId) {
        if (subClassId == null || subClassId.length() == 0) {
            return eventUserDao.getInfo();
        } else {
            return eventUserDao.getInfoWithParam(subClassId);
        }
    }

    @Override
    public void addUserEvent(JSONObject requestJson) {
        String userId = requestJson.getString("userId");
        String subClassId = requestJson.getString("subClassId");
        String operate = requestJson.getString("operate");
        eventUserDao.addUserEvent(userId, subClassId, operate);
    }

    @Override
    public void editUserEvent(JSONObject requestJson) {
        String userId = requestJson.getString("userId");
        String subClassId = requestJson.getString("subClassId");
        String operate = requestJson.getString("operate");
        Integer status = requestJson.getInteger("status");
        eventUserDao.editUserEvent(userId, subClassId, operate, status);
    }
}
