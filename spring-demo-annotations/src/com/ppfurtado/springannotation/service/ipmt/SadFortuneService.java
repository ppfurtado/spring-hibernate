package com.ppfurtado.springannotation.service.ipmt;

import com.ppfurtado.springannotation.service.FortuneService;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today  is a sad day";
    }
}
