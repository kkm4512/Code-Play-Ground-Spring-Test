package com.example.codplaygroundspringtest.eventListener;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Animal {
    public void allAnimal(){
        dog();
        cat();
        tiger();
        monkey();
    }

    @Async
    public void dog(){
        System.out.println("dog가 짖습니다" + Thread.currentThread().getName());
    }

    @Async
    public void cat(){
        System.out.println("cat가 짖습니다" + Thread.currentThread().getName());
    }

    @Async
    public void tiger(){
        System.out.println("tiger가 짖습니다" + Thread.currentThread().getName());
    }

    @Async
    public void monkey(){
        System.out.println("monkey가 짖습니다" + Thread.currentThread().getName());
    }
}
