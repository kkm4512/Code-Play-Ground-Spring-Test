package com.example.codplaygroundspringtest.eventListener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j(topic = "EventHandler")
public class EventHandler {
    @EventListener
    public void process(EventDto eventDto) {
        log.info("name : {}, content : {}, hobby : {}, curTime : {},", eventDto.getName(),eventDto.getContent(),eventDto.getHobby(), LocalDateTime.now());
    }
}
