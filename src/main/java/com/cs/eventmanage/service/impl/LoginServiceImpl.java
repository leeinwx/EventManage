package com.cs.eventmanage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.cs.eventmanage.config.exception.CommonJsonException;
import com.cs.eventmanage.dao.LoginDao;
import com.cs.eventmanage.service.LoginService;
import com.cs.eventmanage.service.TokenService;
import com.cs.eventmanage.util.CommonUtil;
import com.cs.eventmanage.util.constants.ErrorEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Autowired
    private TokenService tokenService;


    @Override
    public JSONObject authLogin(JSONObject jsonObject) {
        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");
        JSONObject info = new JSONObject();
        JSONObject user = loginDao.checkUser(username, password);
        if (user == null) {
            throw new CommonJsonException(ErrorEnum.E_10010);
        }
        String token = tokenService.generateToken(username);
        info.put("token", token);
        return CommonUtil.successJson(info);
    }
}
