package com.luv2code.springdemo.app;

import com.luv2code.springdemo.coach.Coach;
import com.luv2code.springdemo.coach.GolfCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

    public static void main(String[] args) {

        //initialize context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //create bean
        Coach theCoach = context.getBean("myGolfCoach", GolfCoach.class);

        //print methods
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //close context
        context.close();
    }
}
