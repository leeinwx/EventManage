package com.cs.eventmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hello")
public class TestController {

    @RequestMapping(value = "/test")
    public String test(){
        return "index";
    }

}
