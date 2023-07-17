package com.cs.eventmanage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dao.ProvinceCityDao;
import com.cs.eventmanage.dao.SubEventDao;
import com.cs.eventmanage.dto.session.ProvinceCityInfo;
import com.cs.eventmanage.dto.session.SubClassInfo;
import com.cs.eventmanage.service.SubClassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SubClassServiceImpl implements SubClassService {

    @Autowired
    private SubEventDao subEventDao;

    @Autowired
    private ProvinceCityDao provinceCityDao;

    @Override
    public List<SubClassInfo> getEventSubClass(JSONObject requestJson) {
        String classId = requestJson.getString("classId");
        return subEventDao.getEventSubClass(classId);
    }

    @Override
    public void addEventSubClass(JSONObject requestJson) {
        String classId = requestJson.getString("classId");
        //todo
        String subClassId = "2222";
        String subClassName = requestJson.getString("subClassName");
        subEventDao.addEventSubClass(classId, subClassId, subClassName);
    }

    @Override
    public void updateEventSubClass(JSONObject requestJson) {
        String classId = requestJson.getString("classId");
        String subClassId = requestJson.getString("subClassId");
        String subClassName = requestJson.getString("subClassName");
        Integer status = requestJson.getInteger("status");
        subEventDao.updateEventSubClass(classId, subClassId, subClassName, status);
    }

    @Override
    public List<ProvinceCityInfo> getCityList() {
        return provinceCityDao.getCityList();
    }
}
