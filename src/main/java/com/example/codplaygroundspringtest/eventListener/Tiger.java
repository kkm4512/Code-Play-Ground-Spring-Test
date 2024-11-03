package com.example.codplaygroundspringtest.eventListener;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Tiger {
    @Async
    public void tiger(){
        System.out.println("tiger 짖습니다" + Thread.currentThread().getName());
    }
}
