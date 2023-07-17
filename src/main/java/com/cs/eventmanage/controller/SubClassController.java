package com.cs.eventmanage.controller;

import com.cs.eventmanage.dto.session.ProvinceCityInfo;
import com.cs.eventmanage.service.SubClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subClass")
public class SubClassController {

    @Autowired
    private SubClassService subClassService;

    @GetMapping("/getClass")
    List<Object> getEventSubClass() {
        return null;
    }

    @PostMapping("/addClass")
    void addEventSubClass() {

    }

    @PostMapping("/updateClass")
    void updateEventSubClass() {

    }

    @PostMapping("/getCityList")
    List<ProvinceCityInfo> getCityList() {
        return subClassService.getCityList();
    }

}
