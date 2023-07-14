package com.cs.eventmanage.controller;

import com.cs.eventmanage.dto.session.MenuInfo;
import com.cs.eventmanage.dto.session.UserInfo;
import com.cs.eventmanage.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
