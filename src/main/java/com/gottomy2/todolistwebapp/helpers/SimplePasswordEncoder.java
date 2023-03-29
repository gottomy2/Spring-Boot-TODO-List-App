package com.gottomy2.todolistwebapp.helpers;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SimplePasswordEncoder {

    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = "password";
        String encodedPassword = passwordEncoder.encode(password);

        System.out.println("Password: " + password);
        System.out.println("Encoded Password: " + encodedPassword);
    }
}
