package com.example.codplaygroundspringtest.eventListener;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Cat {
    @Async
    public void cat(){
        System.out.println("cat가 짖습니다" + Thread.currentThread().getName());
    }
}
