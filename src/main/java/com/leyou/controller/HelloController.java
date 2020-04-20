package com.leyou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

@Controller
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private DataSource dataSource;//null

    //@RequestMapping +get请求
    @GetMapping("say")
    @ResponseBody
    public  String sayHello(){
        return "hello"+dataSource;//json字符串


   }
}
