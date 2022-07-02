package com.ppfurtado.springannotation.service.ipmt;

import com.ppfurtado.springannotation.service.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class DatabaseForuneService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
}
