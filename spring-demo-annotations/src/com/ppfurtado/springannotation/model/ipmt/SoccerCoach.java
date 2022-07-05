package com.ppfurtado.springannotation.model.ipmt;

import com.ppfurtado.springannotation.model.Coach;
import com.ppfurtado.springannotation.service.FortuneService;

public class SoccerCoach implements Coach {

    private FortuneService fortuneService;

    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "We will practice corner kick";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
