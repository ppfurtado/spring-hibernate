package com.ppfurtadocode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        //  Carregar o arquivo de configuração
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //  recuperar bean do container spring
        CricketCoach theCoach = context.getBean("myCricketCoah", CricketCoach.class);

        // Chamando métodos do bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        // chamando métodos literais
        System.out.println(theCoach.getEmailAddress());

        System.out.println(theCoach.getTeam());

        // fechando o context
        context.close();

    }

}
