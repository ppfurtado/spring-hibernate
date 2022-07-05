package com.ppfurtado.springannotation.testermain;

import com.ppfurtado.springannotation.config.SportConfig;
import com.ppfurtado.springannotation.model.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
//        carregar o arquivo de configuração
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // obter bean do container spring
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // chamar um método no bean
        System.out.println(theCoach.getDailyWorkout());

        // chamar o método getDailyDortune
        System.out.println(theCoach.getDailyFortune());

        // fechar o context
        context.close();
    }
}
