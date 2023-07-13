package com.cs.eventmanage.service.impl;

import com.cs.eventmanage.dao.MenuDao;
import com.cs.eventmanage.dao.UserDao;
import com.cs.eventmanage.dto.session.MenuInfo;
import com.cs.eventmanage.dto.session.UserInfo;
import com.cs.eventmanage.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private MenuDao menuDao;

    @Autowired
    private UserDao userDao;


    /**
     * get all menu info
     * @return
     */
    @Override
    public List<MenuInfo> getMenuList() {
        return menuDao.getMenuList();
    }

    @Override
    public List<UserInfo> getUserList() {
        return userDao.getUserList();
    }
}
