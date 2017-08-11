package com.wasu.controller;

import com.wasu.entity.User;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

/**
 * Created by zhangjy on 2017/8/11.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public User sayHello() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        return user;
    }
}
