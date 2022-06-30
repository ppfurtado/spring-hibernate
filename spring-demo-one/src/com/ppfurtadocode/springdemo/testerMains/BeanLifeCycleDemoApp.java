package com.ppfurtadocode.springdemo.testerMains;

import com.ppfurtadocode.springdemo.model.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {


//        carregar o arquivo de configuração  do spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/ppfurtadocode/springdemo/config/context/beanLifeCycle-applicationContext.xml");


//        recuperando bean do container spring
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        // fechando  o context
        context.close();
    }

}
