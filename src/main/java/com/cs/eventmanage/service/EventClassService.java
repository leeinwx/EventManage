package com.cs.eventmanage.service;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dto.session.BigClassInfo;

import java.util.List;

public interface EventClassService {

    List<BigClassInfo> getEventClass();

    void addClass(JSONObject requestJson);

    void updateClass(JSONObject requestJson);

}
