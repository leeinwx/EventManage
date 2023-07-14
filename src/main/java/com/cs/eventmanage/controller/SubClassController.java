package com.cs.eventmanage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subClass")
public class SubClassController {

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
    List<Object> getCityList() {
        return null;
    }

}
