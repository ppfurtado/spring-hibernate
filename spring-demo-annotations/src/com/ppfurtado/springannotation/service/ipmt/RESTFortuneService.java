package com.ppfurtado.springannotation.service.ipmt;

import com.ppfurtado.springannotation.service.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
}
