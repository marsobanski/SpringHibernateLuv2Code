package com.luv2code.springdemo.annotationsConfig.app;

import com.luv2code.springdemo.annotationsConfig.coach.Coach;
import com.luv2code.springdemo.annotationsConfig.coach.RunCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsConfig/applicationContext.xml");

        Coach theCoach = context.getBean("runCoach", Coach.class);

        System.out.println("RunCoach fortune - " + theCoach.getDailyFortune());

        context.close();
    }
}
