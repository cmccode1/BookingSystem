package com.bookingsystem.bookingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping({"/login"})
    public String returnLogin(Model model){

        int[] intArr = new int[4];

        intArr.length

        return "login";
    }

}
