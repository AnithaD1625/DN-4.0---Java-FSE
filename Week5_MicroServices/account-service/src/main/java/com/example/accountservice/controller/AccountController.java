package com.example.accountservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/account/info")
    public String getInfo() {
        return "Account service is working";
    }
}
