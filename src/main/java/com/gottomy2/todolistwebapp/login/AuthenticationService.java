package com.gottomy2.todolistwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){

        return username.equals("gottomy") && password.equals("pass");
    }
}
