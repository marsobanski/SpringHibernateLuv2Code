package com.luv2code.springdemo.annotationsConfig.fortuneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {

    private String filePath = "/Users/marcin/Files/fortunes.txt";
    private List<String> fortunes = new ArrayList<>();
    private Random random = new Random();

    public FileFortuneService() {

    }

    @PostConstruct
    public void beanStartup() {
        File file = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String tempLine;
            while ((tempLine = reader.readLine()) != null) {
                fortunes.add(tempLine);
            }
            System.out.println("Inside FileFortuneService pre construct method");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        int index = random.nextInt(fortunes.size());
        return fortunes.get(index);
    }
}
