package com.ppfurtadocode.springdemo.model;

public class SoccerCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Gonna try ball long";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
