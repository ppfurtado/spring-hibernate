package com.ppfurtadocode.springdemo.testerMains;

import com.ppfurtadocode.springdemo.model.Coach;
import com.ppfurtadocode.springdemo.model.TrackCoach;

public class MyApp {

    public static void main(String[] args) {

        Coach baseBallCoach = new TrackCoach();

        System.out.println(baseBallCoach.getDailyWorkout());

    }
}
