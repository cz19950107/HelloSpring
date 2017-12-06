package com.biz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by 春子 on 2017/12/6.
 */
@Controller
@RequestMapping(value = "/welcome")
public class HelloSpringController {


    @RequestMapping(value = "/spring", method = GET)
    public ModelAndView sayHelloWorld() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello Spring!");
        mv.setViewName("hellospring");
        return mv;
    }


}
