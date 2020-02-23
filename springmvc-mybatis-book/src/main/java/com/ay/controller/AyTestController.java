package com.ay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
//可以换成component或者service
public class AyTestController {
    @RequestMapping("/hello")
    public void hello(){
        System.out.println("hello ay ~~~");
    }
}
