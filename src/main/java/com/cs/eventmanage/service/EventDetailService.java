package com.cs.eventmanage.service;

import com.alibaba.fastjson.JSONObject;

public interface EventDetailService {

    void addInfo(JSONObject requestJson);

    void editInfo(JSONObject requestJson);

}
