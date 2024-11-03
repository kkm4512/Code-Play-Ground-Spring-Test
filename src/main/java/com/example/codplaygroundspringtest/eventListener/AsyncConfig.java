package com.example.codplaygroundspringtest.eventListener;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@EnableAsync
@Configuration
public class AsyncConfig {
    public ThreadPoolTaskExecutor test(){
        return new ThreadPoolTaskExecutor();
    }
}
