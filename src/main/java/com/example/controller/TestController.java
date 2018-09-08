package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/22 0022.
 */
@RestController
public class TestController {

    @RequestMapping("/t")
    public String home(){
        return "hello tttt";
    }

}
