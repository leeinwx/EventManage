package com.cs.eventmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dto.session.ProvinceCityInfo;
import com.cs.eventmanage.dto.session.SubClassInfo;
import com.cs.eventmanage.service.SubClassService;
import com.cs.eventmanage.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subClass")
public class SubClassController {

    @Autowired
    private SubClassService subClassService;

    /**
     * show sub event class
     * @param classId
     * @return
     */
    @GetMapping("/getClass")
    JSONObject getEventSubClass(@RequestParam(value = "classId") String classId) {
        List<SubClassInfo> list = subClassService.getEventSubClass(classId);
        return CommonUtil.successJson(list);
    }

    /**
     * add sub event class
     * @param requestJson
     * @return
     */
    @PostMapping("/addClass")
    JSONObject addEventSubClass(@RequestBody JSONObject requestJson) {
        subClassService.addEventSubClass(requestJson);
        return CommonUtil.successJson();
    }

    /**
     * update sub event class
     * @param requestJson
     * @return
     */
    @PostMapping("/updateClass")
    JSONObject updateEventSubClass(@RequestBody JSONObject requestJson) {
        subClassService.updateEventSubClass(requestJson);
        return CommonUtil.successJson();
    }

    /**
     * get all city info to edit subclass attribute
     * @return
     */
    @PostMapping("/getCityList")
    JSONObject getCityList() {
        List<ProvinceCityInfo> list = subClassService.getCityList();
        return CommonUtil.successJson(list);
    }

}
