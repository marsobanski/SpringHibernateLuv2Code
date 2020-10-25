package com.luv2code.springdemo.xmlConfig.app;

import com.luv2code.springdemo.xmlConfig.coach.Coach;
import com.luv2code.springdemo.xmlConfig.coach.GolfCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

    public static void main(String[] args) {

        //initialize context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xmlConfig/applicationContext.xml");

        //create bean
        Coach theCoach = context.getBean("myGolfCoach", GolfCoach.class);
        Coach secondCoach = context.getBean("myGolfCoach", GolfCoach.class);

        //print methods
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println("theCoach: " + theCoach);
        System.out.println("secondCoach: " + secondCoach);

        //close context
        context.close();
    }
}
