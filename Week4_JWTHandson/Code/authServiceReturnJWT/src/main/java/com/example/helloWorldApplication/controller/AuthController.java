package com.example.helloWorldApplication.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloWorldApplication.model.AuthRequest;
import com.example.helloWorldApplication.util.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
public String login(@RequestBody AuthRequest request) {
    if ("user".equals(request.getUsername()) && "pass".equals(request.getPassword())) {
        return JwtUtil.generateToken(request.getUsername());
    } else {
        throw new RuntimeException("Invalid Credentials");
    }
}


}