package com.luv2code.springdemo.annotationsConfig.fortuneService;
import org.springframework.beans.factory.annotation.Autowired;


public class RunFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Swim is life";
    }

}
