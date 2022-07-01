package com.ppfurtado.springannotation.service.ipmt;

import com.ppfurtado.springannotation.service.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
