package com.luv2code.springdemo.xmlConfig.app;

import com.luv2code.springdemo.xmlConfig.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

    public static void main(String[] args) {

        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xmlConfig/beanLifecycle-applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        //close context
        context.close();

    }
}
