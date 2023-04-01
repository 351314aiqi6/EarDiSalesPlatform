package com.ear.di.service;

import cn.hutool.extra.spring.SpringUtil;
import com.alibaba.fastjson2.JSON;
import com.ear.di.comm.Result;
import com.ear.di.dao.IppEMandateEventMapper;
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
        IppEMandateEventMapper bean = SpringUtil.getBean(IppEMandateEventMapper.class);
        return Result.success(bean.selectByPrimaryKey(430817L));
    }
}
