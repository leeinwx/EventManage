package com.cs.eventmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.service.DashBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class DashBoardController {

    @Autowired
    private DashBoardService dashBoardService;

    @PostMapping("/check")
    void check(@RequestBody JSONObject requestJson) {
        dashBoardService.check(requestJson);
    }

}
