package com.example.codplaygroundspringtest.redis2.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Slave {
    private String host;
    private int port;
}
