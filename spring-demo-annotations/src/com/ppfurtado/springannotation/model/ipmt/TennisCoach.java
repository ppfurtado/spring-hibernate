package com.ppfurtado.springannotation.model.ipmt;

import com.ppfurtado.springannotation.model.Coach;
import com.ppfurtado.springannotation.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> TennisCoach inside  default constructor");
    }

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside  doSomeCrazyStuff method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your bollhan volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
