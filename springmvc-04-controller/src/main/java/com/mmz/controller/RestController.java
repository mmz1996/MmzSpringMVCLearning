package com.mmz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Classname RestController
 * @Description TODO
 * @Date 2021/3/2 19:58
 * @Created by mmz
 */
@Controller
public class RestController {
    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
        /*@GetMapping*/
    public String test(@PathVariable int a,@PathVariable int b, Model model){
        int result = a+b;
        model.addAttribute("msg","结果为"+result);
        return "test";
    }
}
