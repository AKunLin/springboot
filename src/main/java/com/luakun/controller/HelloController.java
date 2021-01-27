package com.luakun.controller;

import com.luakun.pojo.User;
import com.luakun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author AKunLin
 * Date: 2021/1/26  19:48
 * Description: HelloController
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;
    @GetMapping("/hello")
    public void hello(){
        System.out.println("hello Spring Boot");
    }
    @GetMapping("/findAllUser")
    public List<User> findAllUser(){
        List<User> list = userService.findAllUser();
        return list;
    }
}
