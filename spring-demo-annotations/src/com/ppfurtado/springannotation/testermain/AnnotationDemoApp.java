package com.ppfurtado.springannotation.testermain;

import com.ppfurtado.springannotation.model.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
//        carregar o arquivo de configuração
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/ppfurtado/springannotation/config/context/applicationContext.xml");

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
