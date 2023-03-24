package com.gottomy2.todolistwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("login")
    private String gotoLoginPage(@RequestParam String name, ModelMap model){
        model.addAttribute("name",name);
        return "login";
    }
}
