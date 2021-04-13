package com.mmz.controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Classname ModelTest1
 * @Description TODO
 * @Date 2021/3/3 2:51
 * @Created by mmz
 */
@Controller
public class ModelTest1 {

    @RequestMapping("/m/t")
    public String test(HttpServletRequest req ,HttpServletRequest resp){
        HttpSession session = req.getSession();
        System.out.println(session.getId());
        return "test";
    }
}
