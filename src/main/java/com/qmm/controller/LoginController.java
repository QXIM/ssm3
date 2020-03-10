package com.qmm.controller;

import com.qmm.entity.User;
import com.qmm.service.UserService;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class LoginController {


    @RequestMapping("/hello")
    public  String testMvc(){

        return "hello";

    }






}
