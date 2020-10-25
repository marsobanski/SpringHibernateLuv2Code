package com.luv2code.springdemo.annotationsConfig.fortuneService;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    //create array of Strings
    private String[] data = {
            "Beware of wolf in ship's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    //create random num generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        //pick a random String from array
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
