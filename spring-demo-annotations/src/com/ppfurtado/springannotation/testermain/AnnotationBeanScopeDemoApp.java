package com.ppfurtado.springannotation.testermain;

import com.ppfurtado.springannotation.model.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // carregar o arquivo de configuração context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/ppfurtado/springannotation/config/context/applicationContext.xml");

        // recuperar o bean do container spring
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // checar se eles são iguais
        boolean check = theCoach == alphaCoach;

        // prints dos resultados
        System.out.println("Check: " + check);
        System.out.println("Mémoria alocada para o theCoach: " + theCoach);

        System.out.println("Mémoria alocada para o alphaCoach: " + alphaCoach);

        //fechar o context
        context.close();
    }
}

