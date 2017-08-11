package com.wasu.controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;

import javax.xml.ws.RequestWrapper;

/**
 * Created by zhangjy on 2017/8/11.
 */
@Controller
public class TestController {

    public String sayHello(

    ) {
        return "Hello World!";
    }
}
