package com.ppfurtado.springannotation.config;

import com.ppfurtado.springannotation.model.Coach;
import com.ppfurtado.springannotation.model.ipmt.SoccerCoach;
import com.ppfurtado.springannotation.service.FortuneService;
import com.ppfurtado.springannotation.service.ipmt.IsTodayFortune;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoccerConfig {

    @Bean
    public FortuneService myFortuneService(){
        return new IsTodayFortune();
    }

    @Bean
    public Coach myCoachSoccer(){
        return new SoccerCoach(myFortuneService());
    }
}
