package com.mmz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2021/3/3 3:02
 * @Created by mmz
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @GetMapping("/t1")
    public String test1(String name, Model model){
        // 1.接受前端参数
        System.out.println(name);
        // 2.将返回的结果传递给前端
        model.addAttribute("msg",name);
        return "test";
    }
}
