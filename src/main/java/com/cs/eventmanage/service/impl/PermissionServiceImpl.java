package com.cs.eventmanage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dao.MenuDao;
import com.cs.eventmanage.dto.session.MenuInfo;
import com.cs.eventmanage.dto.session.UserInfo;
import com.cs.eventmanage.service.PermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private MenuDao menuDao;

    /**
     * get all menu info
     * @return
     */
    @Override
    public List<MenuInfo> getMenuList(String name) {
        if (name == null || name.length() == 0) {
            return menuDao.getMenuList();
        }
        return menuDao.getMenuListWithParam(name);
    }

    @Override
    public List<UserInfo> getUserList() {
        return menuDao.getUserList();
    }

    @Override
    public void addUserPermission(JSONObject requestJson) {
        String menuCode = requestJson.getString("menuCode");
        List<String> userList = (List<String>) requestJson.get("userList");
        requestJson.get("userList");
        menuDao.addMenuPermission(menuCode, userList);
    }
}
