package com.ear.di.service;

import cn.hutool.extra.spring.SpringUtil;
import com.ear.di.comm.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class ControllerTest {

    @ResponseBody
    @RequestMapping(value = "/hello",method = {RequestMethod.GET,RequestMethod.POST})
    public Result sayHello() {
        System.out.println("hello");
        return null;
    }
}
