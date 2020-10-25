package com.luv2code.springdemo.xmlConfig.app;

import com.luv2code.springdemo.xmlConfig.coach.Coach;
import com.luv2code.springdemo.xmlConfig.coach.TrackCoach;

public class MyApp {
    public static void main(String[] args) {
        // create object
        Coach theCoach = new TrackCoach();

        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
