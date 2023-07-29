package com.cs.eventmanage.dto.session;

import lombok.Data;

@Data
public class EventOperateInfo {

    private String userId;

    private String username;

    private String subClassId;

    private String operate;

    private Integer status;

    private String updateTime;

}
