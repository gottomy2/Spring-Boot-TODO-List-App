package com.gottomy2.todolistwebapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    private String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    private String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if(authenticationService.authenticate(name,password)){
            model.addAttribute("name",name);

            return "welcome";
        }
        else{
            model.put("errorMessage","Invalid Credentials, please try again!");
            return "login";
        }
    }
}
