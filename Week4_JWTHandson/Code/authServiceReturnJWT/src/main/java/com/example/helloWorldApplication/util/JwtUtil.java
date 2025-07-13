package com.example.helloWorldApplication.util;

import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {

    private static final String SECRET_KEY = "mySecretKey";

    public static String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuer("my-app")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // 1 day
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
}