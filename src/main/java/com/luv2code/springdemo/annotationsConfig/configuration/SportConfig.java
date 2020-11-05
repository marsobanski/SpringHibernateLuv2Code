package com.luv2code.springdemo.annotationsConfig.configuration;

import com.luv2code.springdemo.annotationsConfig.coach.SwimCoach;
import com.luv2code.springdemo.annotationsConfig.coach.Coach;
import com.luv2code.springdemo.annotationsConfig.fortuneService.FortuneService;
import com.luv2code.springdemo.annotationsConfig.fortuneService.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.luv2code.springdemo.annotationsConfig")
public class SportConfig {

    //define bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //define bean for swim coach and inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
