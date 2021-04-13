package com.mmz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname ControllerTest2
 * @Description TODO
 * @Date 2021/3/2 15:17
 * @Created by mmz
 */
@Controller // 代表被Spring托管
public class ControllerTest2 {

    @RequestMapping("/t2")
    public String test(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "test";
    }
}
