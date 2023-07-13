package com.cs.eventmanage.service.impl;

import com.cs.eventmanage.dao.LoginDao;
import com.cs.eventmanage.service.TokenService;
import com.cs.eventmanage.util.StringTools;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class TokenServiceImpl implements TokenService {

    @Autowired
    LoginDao loginDao;

    @Override
    public String generateToken(String username) {
        MDC.put("username", username);
        String token = UUID.randomUUID().toString().replace("-", "").substring(0, 20);
        //设置用户信息缓存
        setCache(token, username);
        return token;
    }

    @Override
    public void invalidateToken() {
        String token = MDC.get("token");
        if (!StringTools.isNullOrEmpty(token)) {
            //cacheMap.invalidate(token);
        }
        log.debug("退出登录,清除缓存:token={}", token);
    }

    private void setCache(String token, String username) {
        log.info("设置用户信息缓存:token={} , username={}", token, username);
        //cacheMap.put(token, null);
    }

}
