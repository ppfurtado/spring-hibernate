package com.ppfurtado.springannotation.config;

import com.ppfurtado.springannotation.model.Coach;
import com.ppfurtado.springannotation.model.ipmt.SwimCoach;
import com.ppfurtado.springannotation.service.FortuneService;
import com.ppfurtado.springannotation.service.ipmt.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@ComponentScan("com.ppfurtado.springannotation")
@PropertySources("classpath:com/ppfurtado/springannotation/properties/sport.properties")
public class SportConfig {

    // definindo bean para  nossa sad fortune service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    // definindo bean para nossa swim coach  and inject  dependerency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
