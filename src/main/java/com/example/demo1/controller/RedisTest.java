package com.example.demo1.controller;

import com.example.demo1.service.RedissonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@RestController
public class RedisTest {
    @Autowired
    RedissonService redissonService;
    @GetMapping("/test1")
    public String  test1() throws InterruptedException {
        redissonService.insertRedis();
        return "ok";
    }
}
