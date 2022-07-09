package com.ppfurtado.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HelloWorldController {


    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }


    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        // lendo o parametro da resposta do formulário
        String theName = request.getParameter("studentName");

        // Converter o texto para caixa alta
        theName = theName.toUpperCase(Locale.ROOT);

        // criando a mensagem
        String result = "Yo, " + theName;

        // adicioando a mensagem  no model
        model.addAttribute("message", result);

        // retornando o jsp
        return "helloworld";
    }


}
