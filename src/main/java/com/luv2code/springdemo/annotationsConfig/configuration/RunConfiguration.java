package com.luv2code.springdemo.annotationsConfig.configuration;

import com.luv2code.springdemo.annotationsConfig.coach.Coach;
import com.luv2code.springdemo.annotationsConfig.coach.RunCoach;
import com.luv2code.springdemo.annotationsConfig.fortuneService.FortuneService;
import com.luv2code.springdemo.annotationsConfig.fortuneService.RunFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RunConfiguration {

    @Bean
    public FortuneService runFortuneService() {
        return new RunFortuneService();
    }

    @Bean
    public Coach runCoach() {
        return new RunCoach(runFortuneService());
    }
}
