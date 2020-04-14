package cn.zack.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping(path = "/test1")
    public String test1(@RequestParam("username") String username, @RequestParam("password") String password){
        logger.info("调用test1================,username:{},password:{}", username, password);
        return "用户名: " + username + "\n密码: " + password;
    }
}