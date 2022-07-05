package com.ppfurtado.springannotation.model.ipmt;

import com.ppfurtado.springannotation.model.Coach;
import com.ppfurtado.springannotation.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> TennisCoach inside  default constructor");
    }

    //definindo o método que será iniciado
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">> TennisCoach: inside  of doMyStartupStuff");
    }

    //definiando o método que sera descruido
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">> TennisCoach: inside  of doMyCleanupStuff");
    }

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println(">> TennisCoach: inside  doSomeCrazyStuff method");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your bollhan volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
