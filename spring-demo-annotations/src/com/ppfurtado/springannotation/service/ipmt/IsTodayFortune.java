package com.ppfurtado.springannotation.service.ipmt;

import com.ppfurtado.springannotation.service.FortuneService;

public class IsTodayFortune implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a day very very lucky";
    }
}
