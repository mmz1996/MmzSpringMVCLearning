package com.mmz.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mmz.pojo.User;
import com.mmz.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2021/3/3 20:46
 * @Created by mmz
 */
@RestController
public class UserController {

    // 不会走视图解析器，会直接返回一个字符串
    @RequestMapping(value = "/j1")
    public String json1() throws JsonProcessingException {
        // jackson , objectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        // 创建一个对象
        User user = new User("mmz",18,"男");

        String string =  objectMapper.writeValueAsString(user);

        return string;
    }


    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException{
        Date date = new Date();
        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }
}
