package com.cs.eventmanage.service;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dto.session.EventOperateInfo;

import java.util.List;

public interface EventUserService {

    List<EventOperateInfo> getInfo(String subClassId);

    void addUserEvent(JSONObject requestJson);

    void editUserEvent(JSONObject requestJson);

}
