package com.cs.eventmanage.service;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dto.session.EventCheckInfo;

import java.util.List;

public interface DashBoardService {

    List<EventCheckInfo> getBasic();

    void check(JSONObject requestJson);

}
