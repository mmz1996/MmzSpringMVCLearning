package com.mmz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2021/3/2 14:13
 * @Created by mmz
 */
@Controller
@RequestMapping("/hello")
public class HelloController  {

    /*localhost:8080/hello/h1*/
    @RequestMapping("/h1")
    public String hello(Model model){
        // 封装数据
        model.addAttribute("msg","hello,springmvc");
        return "hello"; // 会被视图解析器处理

    }
}
