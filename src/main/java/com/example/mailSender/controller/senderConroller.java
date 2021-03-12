package com.example.mailSender.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class senderConroller {

    @GetMapping(value = "/")
    public String sendmail() {
        return "sendmail started";
    }
}
