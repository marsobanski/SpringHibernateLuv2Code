package com.luv2code.springdemo.xmlConfig.coach;

public class SwimmingCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Did 2 km on the lake";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

}
