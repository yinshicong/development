package com.example.controller;

import com.example.anno.Call;
import com.example.dto.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by Administrator on 2018/6/22 0022.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String home(){
        return "hello wechat";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

//    @RequestMapping("g")
//    public String g(
//            @RequestParam Integer productId,
//            @RequestParam Integer shopId
//    ){
//        System.out.println(productId);
//        System.out.println(shopId);
//        return "hello world";
//    }
//
//    @PostMapping(value = "p")
//    public String p(User user){
//        return "hello world";
//    }
//
//    @PostMapping(value = "a")
//    @Call
//    public String a(@CookieValue User user){
//        return "hello world";
//    }
//
//    @GetMapping(value = "b")
//    @Call
//    public String b(String name,Integer age){
//        return "hello world";
//    }
//
//    @PostMapping(value = "b2c/ccc",consumes = "application/x-www-form-urlencoded;charset=UTF-8")
//    public String ccc(User user){
//        return "ccc";
//    }
//
//    @PostMapping(value = "b2c/ccc/ccc",consumes = "application/x-www-form-urlencoded;charset=UTF-8")
//    public String cccc(User user){
//        return "ccc";
//    }

}
