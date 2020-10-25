package com.luv2code.springdemo.annotationsConfig.fortuneService;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
