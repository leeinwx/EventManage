package com.cs.eventmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.service.EventDetailService;
import com.cs.eventmanage.util.CommonUtil;
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

    /**
     * add sub event class info
     * @param requestJson
     * @return
     */
    @PostMapping("/addInfo")
    JSONObject addInfo(@RequestBody JSONObject requestJson) {
        eventDetailService.addInfo(requestJson);
        return CommonUtil.successJson();
    }

    /**
     * edit sub event class info
     * @param requestJson
     * @return
     */
    @PostMapping("/editInfo")
    JSONObject editInfo(@RequestBody JSONObject requestJson) {
        eventDetailService.editInfo(requestJson);
        return CommonUtil.successJson();
    }

}
