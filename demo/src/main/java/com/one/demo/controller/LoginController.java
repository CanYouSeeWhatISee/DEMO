package com.one.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LoginController {


    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody Map<String,Object> params){
        System.out.println("连接中~~~~~~~~~~~~~");
        String Code = "20000";
        return Code;
    }
}
