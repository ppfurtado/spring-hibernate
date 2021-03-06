package com.ppfurtadocode.springdemo.testerMains;

import com.ppfurtadocode.springdemo.model.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        //Carregar os arquivos de configurações
        ClassPathXmlApplicationContext context =
                 new ClassPathXmlApplicationContext("com/ppfurtadocode/springdemo/config/context/applicationContext.xml");

        // Recuperar o bean do container spring
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //Chamando o método no bean
        System.out.println(theCoach.getDailyWorkout());

        //Chamando novo método
        System.out.println(theCoach.getDailyFortune());

        //fechando o contexto
        context.close();
    }
}
