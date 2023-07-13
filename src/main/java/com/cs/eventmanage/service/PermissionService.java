package com.cs.eventmanage.service;

import com.cs.eventmanage.dto.session.MenuInfo;
import com.cs.eventmanage.dto.session.UserInfo;

import java.util.List;

public interface PermissionService {

    List<MenuInfo> getMenuList();

    List<UserInfo> getUserList();

}
