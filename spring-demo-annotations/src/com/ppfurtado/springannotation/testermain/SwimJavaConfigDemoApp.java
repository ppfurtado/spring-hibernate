package com.ppfurtado.springannotation.testermain;

import com.ppfurtado.springannotation.config.SportConfig;
import com.ppfurtado.springannotation.model.Coach;
import com.ppfurtado.springannotation.model.ipmt.SwimCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
//        carregar o arquivo de configuração
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // obter bean do container spring
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // chamar um método no bean
        System.out.println(theCoach.getDailyWorkout());

        // chamar o método getDailyDortune
        System.out.println(theCoach.getDailyFortune());

        // chamar novos métodos coach swim com os valores carregados do arquivo de propriedades
        System.out.println("Email: " +theCoach.getEmail());
        System.out.println("Team: " +theCoach.getTeam());

        // fechar o context
        context.close();
    }
}
