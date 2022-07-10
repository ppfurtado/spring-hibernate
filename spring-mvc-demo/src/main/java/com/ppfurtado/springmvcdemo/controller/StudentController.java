package com.ppfurtado.springmvcdemo.controller;

import com.ppfurtado.springmvcdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String ShowForm(Model theModel){

        Student student = new Student();

        theModel.addAttribute("student", student);

        return "student-form";
    }

    @RequestMapping("/processoForm")
    public String processoForm(@ModelAttribute("student") Student theStudent){

        System.out.println("Student: "+theStudent.getFirstName() +" "+ theStudent.getLastName());

        return "student-confirmation";
    }

}
