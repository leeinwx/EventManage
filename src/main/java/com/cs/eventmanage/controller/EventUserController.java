package com.cs.eventmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.service.EventUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventUser")
public class EventUserController {

    @Autowired
    private EventUserService eventUserService;

    @PostMapping("/addInfo")
    void addUserEvent(@RequestBody JSONObject requestJson) {
        eventUserService.addUserEvent(requestJson);
    }

    @PostMapping("/editInfo")
    void editUserEvent(@RequestBody JSONObject requestJson) {
        eventUserService.editUserEvent(requestJson);
    }

}
