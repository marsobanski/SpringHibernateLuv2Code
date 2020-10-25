package com.luv2code.springdemo.annotationsConfig.app;

import com.luv2code.springdemo.annotationsConfig.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsConfig/applicationContext.xml");

        //get bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

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
