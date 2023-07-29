package com.cs.eventmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dto.session.EventCheckInfo;
import com.cs.eventmanage.service.DashBoardService;
import com.cs.eventmanage.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class DashBoardController {

    @Autowired
    private DashBoardService dashBoardService;

    @GetMapping("getBasic")
    JSONObject getBasic() {
        List<EventCheckInfo> list = dashBoardService.getBasic();
        return CommonUtil.successJson(list);
    }

    @PostMapping("/check")
    void check(@RequestBody JSONObject requestJson) {
        dashBoardService.check(requestJson);
    }

}
