package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.fortuneService.RandomFortuneService;

public class GolfCoach implements Coach {

    private RandomFortuneService randomFortuneService;

    public GolfCoach(RandomFortuneService randomFortuneService) {
    }

    @Override
    public String getDailyWorkout() {
        return "Practice professional putting for 2 hours";
    }

    @Override
    public String getDailyFortune() {
        return randomFortuneService.getFortune();
    }
}
