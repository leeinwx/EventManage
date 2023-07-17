package com.cs.eventmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dto.session.ProvinceCityInfo;
import com.cs.eventmanage.dto.session.SubClassInfo;
import com.cs.eventmanage.service.SubClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subClass")
public class SubClassController {

    @Autowired
    private SubClassService subClassService;

    @PostMapping("/getClass")
    List<SubClassInfo> getEventSubClass(@RequestBody JSONObject requestJson) {
        return subClassService.getEventSubClass(requestJson);
    }

    @PostMapping("/addClass")
    void addEventSubClass(@RequestBody JSONObject requestJson) {
        subClassService.addEventSubClass(requestJson);
    }

    @PostMapping("/updateClass")
    void updateEventSubClass(@RequestBody JSONObject requestJson) {
        subClassService.updateEventSubClass(requestJson);
    }

    /**
     * get all city info to edit subclass attribute
     * @return
     */
    @PostMapping("/getCityList")
    List<ProvinceCityInfo> getCityList() {
        return subClassService.getCityList();
    }

}
