package com.luv2code.springdemo.annotationsConfig.fortuneService;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
}
