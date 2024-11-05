package com.example.codplaygroundspringtest.redis2.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ConfigurationProperties("spring.redis")
@Configuration
@Component
public class RedisInfo {
    private Master master;
    private List<Slave> slaves;
}
