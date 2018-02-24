package com.yscredit.springBuild.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class TestSpring {

    @RequestMapping(value = "/test1")
    @ResponseBody
    public String test1(){
        return "hello dubboDemo!";
    }
}
