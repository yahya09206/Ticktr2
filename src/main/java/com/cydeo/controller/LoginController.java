package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    // route to the login page
    @RequestMapping(value = {"/login","/"})
    public String login(){

        return "login";
    }

    // route to login page
    @RequestMapping("/welcome")
    // return welcome page
    public String welcome(){
        return "welcome";
    }

}