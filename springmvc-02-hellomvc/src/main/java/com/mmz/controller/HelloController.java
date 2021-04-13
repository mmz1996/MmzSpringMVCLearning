package com.mmz.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2021/3/1 21:10
 * @Created by mmz
 */
public class HelloController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("msg","HelloSpringMVC");

        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
