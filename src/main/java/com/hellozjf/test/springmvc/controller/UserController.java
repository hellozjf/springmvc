package com.hellozjf.test.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hellozjf.test.springmvc.domain.User;
import com.hellozjf.test.springmvc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String register() {
        return "user/register";
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView createUser(User user) {
        System.out.println(user);
        userService.createUser(user);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("user/createSuccess");
        mav.addObject("user", user);
        return mav;
    }
}
