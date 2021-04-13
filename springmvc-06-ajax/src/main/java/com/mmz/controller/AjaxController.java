package com.mmz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname AjaxController
 * @Description TODO
 * @Date 2021/4/13 21:04
 * @Created by mmz
 */
@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }
}
