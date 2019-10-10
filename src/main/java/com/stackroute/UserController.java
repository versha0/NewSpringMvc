package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @PostMapping("/show")
    public ModelAndView getName(HttpServletRequest req){

        String name=req.getParameter("username");
        String password=req.getParameter("Password");
        User user=new User();
        user.setName(name);
        user.setPassword(password);
        ModelAndView modelAndView=new ModelAndView("display");
        modelAndView.addObject("value",user.getName());
        return  modelAndView;
    }
}