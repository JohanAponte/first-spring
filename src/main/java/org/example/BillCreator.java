package org.example;

public class BillCreator {

    private CalculatorService calculatorService;
    private String name;

    public BillCreator(CalculatorService calculatorServiceAtt, String name) {
        this.calculatorService = calculatorServiceAtt;
        this.name = name;
        System.out.println("Instantiating a Bill Container");
    }

    @Override
    public String toString() {
        return "BillCreator{" +
                "calculatorService=" + calculatorService +
                ", name='" + name + '\'' +
                '}';
    }
}
