package com.cs.eventmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dto.session.EventOperateInfo;
import com.cs.eventmanage.service.EventUserService;
import com.cs.eventmanage.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventUser")
public class EventUserController {

    @Autowired
    private EventUserService eventUserService;

    @GetMapping("/getInfo")
    JSONObject getInfo(@RequestParam("subClassId") String subClassId) {
        List<EventOperateInfo> list = eventUserService.getInfo(subClassId);
        return CommonUtil.successJson(list);
    }

    @PostMapping("/addInfo")
    JSONObject addUserEvent(@RequestBody JSONObject requestJson) {
        eventUserService.addUserEvent(requestJson);
        return CommonUtil.successJson();
    }

    @PostMapping("/editInfo")
    JSONObject editUserEvent(@RequestBody JSONObject requestJson) {
        eventUserService.editUserEvent(requestJson);
        return CommonUtil.successJson();
    }

}
