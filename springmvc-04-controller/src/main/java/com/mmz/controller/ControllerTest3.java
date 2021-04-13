package com.mmz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname ControllerTest3
 * @Description TODO
 * @Date 2021/3/2 16:13
 * @Created by mmz
 */
@Controller
@RequestMapping("/c")
public class ControllerTest3 {

    @RequestMapping("/t1")
    public String test(Model model){
        model.addAttribute("msg","ControllerTest3");

        return "test";
    }
}
