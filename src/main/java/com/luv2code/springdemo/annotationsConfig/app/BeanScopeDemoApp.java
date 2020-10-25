package com.luv2code.springdemo.annotationsConfig.app;

import com.luv2code.springdemo.annotationsConfig.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        //load application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsConfig/applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println("Coaches are the same object - " + theCoach.equals(alphaCoach));

        System.out.println("theCoach memory location: " + theCoach);
        System.out.println("alphaCoach memory location: " + alphaCoach);

        context.close();
    }
}
