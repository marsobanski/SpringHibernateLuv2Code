package com.luv2code.springdemo.annotationsConfig.app;

import com.luv2code.springdemo.annotationsConfig.coach.Coach;
import com.luv2code.springdemo.annotationsConfig.configuration.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NoXmlConfigApp {

    public static void main(String[] args) {

        //read spring config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get bean from spring container
        Coach theCoach = context.getBean("swimCoach", Coach.class);

        //call method on beam
        System.out.println(theCoach.getDailyWorkout());

        //call method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        System.out.println("Team: " + theCoach.getTeam());
        System.out.println("Email: " + theCoach.getEmail());

        //close context
        context.close();
    }
}
