package com.mmz.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname ControllerTest1
 * @Description TODO
 * @Date 2021/3/2 15:09
 * @Created by mmz
 */
public class ControllerTest1 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","ControllerTest1");
        modelAndView.setViewName("test");
        return modelAndView;
    }
}
