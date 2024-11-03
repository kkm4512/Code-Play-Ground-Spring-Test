package com.example.codplaygroundspringtest.eventListener;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RealAllAnimal {
    private final Dog dog;
    private final Cat cat;
    private final Tiger tiger;
    private final Monkey monkey;

    public void realAllAnimal() {
        dog.dog();
        cat.cat();
        tiger.tiger();
        monkey.monkey();
    }
}
