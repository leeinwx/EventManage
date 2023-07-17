package com.cs.eventmanage.service.impl;

import com.cs.eventmanage.dao.ProvinceCityDao;
import com.cs.eventmanage.dto.session.ProvinceCityInfo;
import com.cs.eventmanage.service.SubClassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SubClassServiceImpl implements SubClassService {

    @Autowired
    private ProvinceCityDao provinceCityDao;

    @Override
    public List<ProvinceCityInfo> getCityList() {
        return provinceCityDao.getCityList();
    }
}
