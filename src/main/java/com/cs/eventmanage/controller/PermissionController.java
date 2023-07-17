package com.cs.eventmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dto.session.MenuInfo;
import com.cs.eventmanage.dto.session.UserInfo;
import com.cs.eventmanage.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    /**
     * get all menu info
     * @return menu list
     */
    @GetMapping("/getMenuList")
    public List<MenuInfo> getMenuList() {
        return permissionService.getMenuList();
    }

    /**
     * get all user except admin account
     * @return
     */
    @GetMapping("/getUserList")
    public List<UserInfo> getUserList() {
        return permissionService.getUserList();
    }

    /**
     * admin account add other user menu permissions
     * @param requestJson menu_code + List user_id
     */
    @PostMapping("/addUserPermission")
    void addUserPermission(@RequestBody JSONObject requestJson) {
        permissionService.addUserPermission(requestJson);
    }

}
