package com.luv2code.springdemo.annotationsConfig.coach;

import com.luv2code.springdemo.annotationsConfig.coach.Coach;
import com.luv2code.springdemo.annotationsConfig.fortuneService.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 m for warmup";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getTeam() {
        return team;
    }
}
