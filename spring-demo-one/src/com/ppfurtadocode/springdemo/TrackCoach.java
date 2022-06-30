package com.ppfurtadocode.springdemo;

import java.time.Instant;
import java.util.Date;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just it " + fortuneService.getFortune();
    }

    //adicionar método para inicionar no bean
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }
    //adicionar método para destruir no bean
    public void doMyCleanupStuffYoYo(){
        System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
    }
}
