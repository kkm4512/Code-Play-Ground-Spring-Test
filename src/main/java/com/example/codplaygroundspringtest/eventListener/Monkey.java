package com.example.codplaygroundspringtest.eventListener;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Monkey {
    @Async
    public void monkey(){
        System.out.println("monkey가 짖습니다" + Thread.currentThread().getName());
    }
}
