package com.example.codplaygroundspringtest.eventListener;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    @Async
    public void dog(){
        System.out.println("dog가 짖습니다" + Thread.currentThread().getName());
    }
}
