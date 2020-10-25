package com.luv2code.springdemo.annotationsConfig.app;

import com.luv2code.springdemo.annotationsConfig.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsConfig/applicationContext.xml");

        Coach gymCoach = context.getBean("gymCoach", Coach.class);

        System.out.println(gymCoach.getDailyWorkout());

        context.close();
    }
}
