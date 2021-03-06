package com.ppfurtadocode.springdemo.model;

import com.ppfurtadocode.springdemo.service.FortuneService;

public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    public BaseBallCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 min on batting pracice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
