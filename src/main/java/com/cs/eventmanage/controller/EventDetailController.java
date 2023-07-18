package com.cs.eventmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.service.EventDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subClassDetail")
public class EventDetailController {

    @Autowired
    private EventDetailService eventDetailService;

    @PostMapping("/addInfo")
    void addInfo(@RequestBody JSONObject requestJson) {
        eventDetailService.addInfo(requestJson);
    }

    @PostMapping("/editInfo")
    void editInfo(@RequestBody JSONObject requestJson) {
        eventDetailService.editInfo(requestJson);
    }

}
