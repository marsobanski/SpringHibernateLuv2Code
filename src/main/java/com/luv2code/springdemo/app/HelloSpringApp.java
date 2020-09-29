package com.luv2code.springdemo.app;

import com.luv2code.springdemo.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve Bean from Spring Container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method for fortunes
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
