package com.cs.eventmanage.service;

import com.alibaba.fastjson.JSONObject;


public interface LoginService {

    JSONObject authLogin(JSONObject jsonObject);

    void addUser(JSONObject jsonObject);

    JSONObject logout();

}
