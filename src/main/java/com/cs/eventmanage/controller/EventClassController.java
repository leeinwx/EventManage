package com.cs.eventmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dto.session.BigClassInfo;
import com.cs.eventmanage.service.EventClassService;
import com.cs.eventmanage.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/class")
public class EventClassController {

    @Autowired
    private EventClassService eventClassService;

    @GetMapping("/getAllType")
    public JSONObject getAllType() {
        return CommonUtil.successJson(eventClassService.getAllType());
    }

    /**
     * get first class info
     * @return
     */
    @GetMapping("/getClass")
    List<BigClassInfo> getEventClass() {
        return eventClassService.getEventClass();
    }

    /**
     * add first class info
     * @param requestJson
     */
    @PostMapping("/addClass")
    void addEventClass(@RequestBody JSONObject requestJson) {
        eventClassService.addClass(requestJson);
    }

    /**
     * update first class detail
     * @param requestJson
     */
    @PostMapping("/updateClass")
    void updateEventClass(@RequestBody JSONObject requestJson) {
        eventClassService.updateClass(requestJson);
    }

}
