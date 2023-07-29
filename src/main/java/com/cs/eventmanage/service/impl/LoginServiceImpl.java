package com.cs.eventmanage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.dao.LoginDao;
import com.cs.eventmanage.service.LoginService;
import com.cs.eventmanage.util.CommonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public JSONObject addUser(JSONObject jsonObject) {
        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");
        String userId = UUID.randomUUID().toString();
        loginDao.addUser(username, password, userId);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject getRandomPassword() {
        String password = loginDao.getRandomPassword();
        return CommonUtil.successJson(password);
    }
}
