package com.jumongweb.usermanagementsystem.service;

import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;

@Component
public class JWTUtils {

    private SecretKey key;
    private static final Long EXPIRATION_TIME =  86400000L; // 24 hours

    public JWTUtils(){
        String secretKey = "";
    }

}
