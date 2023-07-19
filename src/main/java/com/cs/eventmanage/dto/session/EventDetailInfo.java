package com.cs.eventmanage.dto.session;

import lombok.Data;

import java.util.Date;

@Data
public class EventDetailInfo {

    private String classId;

    private String className;

    private String eventType;

    private String subClassId;

    private String subClassName;

    private String cityId;

    private String province;

    private String cityName;

    private Date occurDate;

    private String content;

    private String userId;

    private String userName;

    private String operate;

}
