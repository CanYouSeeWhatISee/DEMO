package com.one.demo.controller;

import com.one.demo.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {


    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody User user){
        System.out.println("连接中~~~~~~~~~~~~~");
        return "Hello Spring Boot!";
    }
}
