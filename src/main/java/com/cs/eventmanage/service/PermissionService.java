package com.cs.eventmanage.service;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dto.session.MenuInfo;
import com.cs.eventmanage.dto.session.UserInfo;

import java.util.List;

public interface PermissionService {

    List<MenuInfo> getMenuList(String name);

    List<UserInfo> getUserList();

    void addUserPermission(JSONObject requestJson);

}
