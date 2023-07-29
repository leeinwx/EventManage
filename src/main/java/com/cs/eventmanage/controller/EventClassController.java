package com.cs.eventmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.service.EventClassService;
import com.cs.eventmanage.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/class")
public class EventClassController {

    @Autowired
    private EventClassService eventClassService;

    /**
     * get add distinct event type
     * @return
     */
    @GetMapping("/getAllType")
    public JSONObject getAllType() {
        return CommonUtil.successJson(eventClassService.getAllType());
    }

    /**
     * get first class info
     * @return
     */
    @GetMapping("/getClass")
    JSONObject getEventClass(@RequestParam(value = "type") String type) {
        return CommonUtil.successJson(eventClassService.getEventClass(type));
    }

    /**
     * add first class info
     * @param requestJson
     */
    @PostMapping("/addClass")
    JSONObject addEventClass(@RequestBody JSONObject requestJson) {
        eventClassService.addClass(requestJson);
        return CommonUtil.successJson();
    }

    /**
     * update first class detail
     * @param requestJson
     */
    @PostMapping("/updateClass")
    JSONObject updateEventClass(@RequestBody JSONObject requestJson) {
        eventClassService.updateClass(requestJson);
        return CommonUtil.successJson();
    }

}
