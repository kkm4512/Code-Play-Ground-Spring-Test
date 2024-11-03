package com.example.codplaygroundspringtest.eventListener;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;

@Slf4j(topic = "EventTest")
@SpringBootTest
public class EventTest {
    @Autowired
    ApplicationEventPublisher aep;

    @Autowired
    Animal animal;

    @Autowired
    RealAllAnimal realAllAnimal;

    @Test
    @DisplayName("이벤트 리스너를 활용한 로그를 확인 할 수 있다")
    void test1(){
        log.info("테스트 코드 시작");
        EventDto eventDto = new EventDto("testName","testContent","testHobby");
        aep.publishEvent(eventDto);
        log.info("테스트 코드 종료");
    }

    @Test
    @DisplayName("같은 클래스 안에서 A메서드를 선언하고, 그 안에 메서드를 호출할때 비동기 메서드라면 비동기로 처리가 안된다?")
    void test2(){
        animal.allAnimal();
    }

    @Test
    @DisplayName("각각의 메서드들을 다른 클래스로 분리시켜본후, 비동기 처리되는지 확인해보기")
    void test3(){
        realAllAnimal.realAllAnimal();
    }
}
