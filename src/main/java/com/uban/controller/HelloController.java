package com.uban.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("hello-ftl")
    public ModelAndView hello(){
        ModelAndView model = new ModelAndView("hello");
        model.addObject("username", "张三");
        return model;
    }

    @RequestMapping("world-jsp")
    public ModelAndView helloworld(){
        ModelAndView model = new ModelAndView("world");
        model.addObject("username", "李四");
        return model;
    }

}