package com.stackroute.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class UserController
{


    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String user( Model model)
    {
        User user = new User();
        user.setUserName("pranathi");
        model.addAttribute("userName", user);
        return "index";
    }
}
