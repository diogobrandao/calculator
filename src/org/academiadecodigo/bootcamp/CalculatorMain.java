package org.academiadecodigo.bootcamp;

public class CalculatorMain {


    public static void main(String[] args) {

        Calculator calculator = new Calculator("casio", "black");


        calculator.setBrand("Texas Instruments");

        String brand = calculator.getBrand();

        System.out.println(calculator.divide(90, 45));


    }






}
