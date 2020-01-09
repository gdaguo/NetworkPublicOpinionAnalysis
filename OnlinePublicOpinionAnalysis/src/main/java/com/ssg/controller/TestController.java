package com.ssg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author sunshuaiguo
 * @Date 2020/1/9 11:27
 * @Version 1.0
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
