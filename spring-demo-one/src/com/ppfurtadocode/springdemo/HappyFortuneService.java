package com.ppfurtadocode.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService{

    private int fortunes;

    @Override
    public String getFortune() {
        String[] f = {" without lucky", "with very lucky", "with lucky"};
        Random gerador = new Random();
        return "Today you is "+ f[gerador.nextInt(3)];
    }


}
