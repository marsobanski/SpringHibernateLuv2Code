package com.luv2code.springdemo.fortuneService;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "today is your Lucky day!";
    }
}
