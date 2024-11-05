package com.example.codplaygroundspringtest.redis2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RedisController {
    private final RedisTemplate<String, String> redisTemplate;

    @GetMapping
    public void redisTest() {
        redisTemplate.opsForValue().set("hello", "world");
    }

    @GetMapping("/get")
    public String get() {
        return redisTemplate.opsForValue().get("hello");
    }

    @GetMapping("/del")
    public void del() {
        redisTemplate.delete("hello");
    }
}
