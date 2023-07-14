package com.cs.eventmanage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/class")
public class EventClassController {

    @GetMapping("/getClass")
    List<Object> getEventClass() {
        return null;
    }

    @PostMapping("/addClass")
    void addEventClass() {

    }

    @PostMapping("/updateClass")
    void updateEventClass() {

    }

}
