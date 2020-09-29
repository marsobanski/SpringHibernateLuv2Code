package com.luv2code.springdemo.app;

import com.luv2code.springdemo.coach.Coach;
import com.luv2code.springdemo.coach.TrackCoach;

public class MyApp {
    public static void main(String[] args) {
        // create object
        Coach theCoach = new TrackCoach();

        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
