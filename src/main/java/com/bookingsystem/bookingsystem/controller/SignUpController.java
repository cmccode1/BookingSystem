package com.bookingsystem.bookingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignUpController {

    @RequestMapping({"/signup", "signup"})
    public String returnSignUp (Model model){
        return "signup";
    }

}
