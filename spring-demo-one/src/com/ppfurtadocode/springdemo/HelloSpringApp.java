package com.ppfurtadocode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        //Carregar os arquivos de configurações
        ClassPathXmlApplicationContext context =
                 new ClassPathXmlApplicationContext("applicationContext.xml");

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
