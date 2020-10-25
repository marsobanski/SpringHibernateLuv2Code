package com.luv2code.springdemo.annotationsConfig.coach;

import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Lift heavy objects for an hour";
    }

    @Override
    public String getDailyFortune() {
        return null;
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
