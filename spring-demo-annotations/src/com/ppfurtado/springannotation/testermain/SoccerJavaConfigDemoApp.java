package com.ppfurtado.springannotation.testermain;

import com.ppfurtado.springannotation.config.SoccerConfig;
import com.ppfurtado.springannotation.model.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SoccerJavaConfigDemoApp {

    public static void main(String[] args) {

    // carregar o arquivo de configuração
    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(SoccerConfig.class);

    // recuperar o bean do container spring
    Coach theCoach = context.getBean("myCoachSoccer", Coach.class);

    // printar os métodos
    System.out.println(theCoach.getDailyWorkout());
    System.out.println(theCoach.getDailyFortune());

    // fechando o context
    context.close();

    }
}
