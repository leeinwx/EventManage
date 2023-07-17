package com.cs.eventmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dto.session.BigClassInfo;
import com.cs.eventmanage.service.EventClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/class")
public class EventClassController {

    @Autowired
    private EventClassService eventClassService;

    @GetMapping("/getClass")
    List<BigClassInfo> getEventClass() {
        return eventClassService.getEventClass();
    }

    @PostMapping("/addClass")
    void addEventClass(@RequestBody JSONObject requestJson) {
        eventClassService.addClass(requestJson);
    }

    @PostMapping("/updateClass")
    void updateEventClass() {

    }

}
