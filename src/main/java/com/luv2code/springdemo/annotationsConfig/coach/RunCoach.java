package com.luv2code.springdemo.annotationsConfig.coach;

import com.luv2code.springdemo.annotationsConfig.fortuneService.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class RunCoach implements Coach {

    @Qualifier("runFortuneService")
    @Autowired
    private FortuneService fortuneService;

    public RunCoach(FortuneService fortuneService) {
        System.out.println("RunCoach - inside Constructor");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getTeam() {
        return null;
    }
}
