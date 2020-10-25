package com.luv2code.springdemo.xmlConfig.app;

import com.luv2code.springdemo.xmlConfig.coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {

        //load Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xmlConfig/applicationContext.xml");

        //retrieve bean from Spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAdress());
        System.out.println(theCoach.getTeam());

        //close the context
        context.close();


    }
}
