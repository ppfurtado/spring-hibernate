package com.ppfurtado.springannotation.service.ipmt;

import com.ppfurtado.springannotation.service.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
      private final String[] f = {" without lucky", "with very lucky", "with lucky"};
      private Random gerador = new Random();

    @Override
    public String getFortune() {
        return "Today you is "+ f[gerador.nextInt(3)];
    }
}
