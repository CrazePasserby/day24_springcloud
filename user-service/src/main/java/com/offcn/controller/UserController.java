package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @Value("${server.port}")
    String port;
    @Autowired
    private UserService userService;

    @GetMapping("getUser/{id}")
    public User getUser(@PathVariable("id") Integer id){
      return   userService.getUser(id);
    }
    @GetMapping("buyMovie/{id}")
    public Map buyMovie(@PathVariable("id") Integer id){
        Map<String, Object> map = userService.buyMovie(id);

        return map;
    }
}
