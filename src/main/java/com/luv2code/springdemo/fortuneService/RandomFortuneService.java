package com.luv2code.springdemo.fortuneService;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String[] fortunes = {"Never give up", "Sky is the limit", "Reach for the stars"};

    @Override
    public String getFortune() {
        Random random = new Random();
        int fortuneNumber = random.nextInt(fortunes.length);
        return fortunes[fortuneNumber];
    }
}
