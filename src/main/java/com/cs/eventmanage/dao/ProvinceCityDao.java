package com.cs.eventmanage.dao;

import com.cs.eventmanage.dto.session.ProvinceCityInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProvinceCityDao {

    List<ProvinceCityInfo> getCityList();

}
