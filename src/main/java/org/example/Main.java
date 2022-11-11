package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Instantiating a Container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        CalculatorService calculatorService = (CalculatorService) context.getBean("calculatorService");

        CalculatorService otherCalculatorService = (CalculatorService) context.getBean("calculatorService");

        System.out.println(calculatorService.helloWorld());


    }
}