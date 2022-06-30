package com.ppfurtadocode.springdemo.testerMains;

import com.ppfurtadocode.springdemo.model.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {


//        carregar o arquivo de configuração  do spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/ppfurtadocode/springdemo/config/context/beanScope-applicationContext.xml");

//        carregar o bean no container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

//        verificar se os as intâncias do Coach são iguais

        boolean result = (theCoach == alphaCoach);


//        imprimir o result
        System.out.println("\nResult: " + result);

        System.out.println("\nMemória alocada para theCoach: " + theCoach);
        System.out.println("\nMemória alocada para alphaCoach: " + alphaCoach);


        // fechando  o context
        context.close();
    }

}
