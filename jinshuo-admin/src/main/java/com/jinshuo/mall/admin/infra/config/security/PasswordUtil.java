package com.jinshuo.mall.admin.infra.config.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Administrator on 2020/7/2.
 */
public class PasswordUtil {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static String BCryptPassword(String password) {
        return encoder.encode(password);
    }

    public static boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encoder.matches(rawPassword, encodedPassword);
    }

    public static void main(String[] args) {
        System.out.println(BCryptPassword("123"));
    }
}
