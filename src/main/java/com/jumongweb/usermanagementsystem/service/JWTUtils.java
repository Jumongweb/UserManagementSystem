package com.jumongweb.usermanagementsystem.service;

import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Component
public class JWTUtils {

    private SecretKey key;
    private static final Long EXPIRATION_TIME =  86400000L; // 24 hours

    public JWTUtils(){
        String secretString = "843567893696976453275974432697R634976R738467TR678T34865R6834R8763T478378637664538745673865783678548735687R3";
        byte[] keyBytes = Base64.getDecoder().decode(secretString.getBytes(StandardCharsets.UTF_8);
        this.key = new SecretKeySpec(Key=Byql("HHmaSH256")))
    }

    private String generate

}
