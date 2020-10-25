package com.luv2code.springdemo.annotationsConfig.coach;

import com.luv2code.springdemo.annotationsConfig.fortuneService.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Qualifier("fileFortuneService") /** używany do wskazania która implementacja FortuneService ma zostać użyta **/
    @Autowired
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

//    @Autowired - constructor
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

//    @Autowired
//    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
//        System.out.println((">> TennisCoach: Inside default constructor using @Autowirde and @Qualifier"));
//    }

    public TennisCoach() {
        System.out.println(">> TennisCoach: Inside default constructor");
    }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("TennisCoach - post startup method");
    }

    @PreDestroy
    public void doMyDestroyStuff() {
        System.out.println("TennisCoach - pre destroy method");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

//    @Autowired - fortuneService setter
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println(">> TennisCoach: inside doSomeCrazyStuff method");
//        this.fortuneService = fortuneService;
//    }


    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
