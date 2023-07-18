package com.cs.eventmanage.service;

import com.alibaba.fastjson.JSONObject;

public interface EventUserService {

    void addUserEvent(JSONObject requestJson);

    void editUserEvent(JSONObject requestJson);

}
