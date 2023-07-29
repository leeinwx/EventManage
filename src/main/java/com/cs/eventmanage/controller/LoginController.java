package com.cs.eventmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.service.LoginService;
import com.cs.eventmanage.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * add user
     * @param requestJson username and password
     */
    @PostMapping("/addUser")
    public JSONObject addUser(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, "username,password");
        return loginService.addUser(requestJson);
    }

    /**
     * get random password then add user
     * @return
     */
    @GetMapping("/getRandomPassword")
    public JSONObject getRandomPassword() {
        return loginService.getRandomPassword();
    }

}
