package com.stackroute;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @GetMapping("/user")
    public ModelAndView user(HttpServletRequest request, HttpServletResponse response){

       // String s=request.getParameter(("username"));
        String uname=request.getParameter(("username"));
        String pass=request.getParameter(("password"));

        ModelAndView mv=new ModelAndView();
     //   mv.setViewName("display");
        mv.addObject("temp",uname);
        mv.addObject("temp1",pass);
        if(uname.equals("harsha")&& pass.equals("12345")){
            mv.setViewName("display");
        }
        else {
            mv.setViewName("wrongCredentials");
        }
    return mv;
    }
}
