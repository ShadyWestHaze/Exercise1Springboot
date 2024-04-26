package com.example.practice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@org.springframework.stereotype.Controller

@RestController
public class MainController {
    CounterService counterService = new CounterService();
    @GetMapping("/rolldice")
    public int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
    @GetMapping("/person")
    public String getPerson(){
        Person person = new Person("That","Guy",1234567890);
        return person.toString();
}
    @GetMapping("/count")
    public int getCount() {
        counterService.incrementCountEndpointCount();
        return counterService.getCountEndpointCount();
    }
    @GetMapping("/multiply")
    public int multiplyByTen(@RequestParam int base) {
        return base * 10;
    }
}