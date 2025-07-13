package com.example.spring_maven_project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring_maven_project.model.Country;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Country country = (Country) context.getBean("country");
        System.out.println("Loaded country: " + country);
    }
}
