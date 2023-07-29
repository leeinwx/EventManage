package com.cs.eventmanage.service;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dto.session.ProvinceCityInfo;
import com.cs.eventmanage.dto.session.SubClassInfo;

import java.util.List;

public interface SubClassService {

    List<SubClassInfo> getEventSubClass(String classId);

    void addEventSubClass(JSONObject requestJson);

    void updateEventSubClass(JSONObject requestJson);

    List<ProvinceCityInfo> getCityList();

}
