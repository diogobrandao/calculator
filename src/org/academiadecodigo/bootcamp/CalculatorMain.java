package org.academiadecodigo.bootcamp;

public class CalculatorMain {


    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Operation add = Operation.ADD;


        System.out.println(calculator.doOperation(Operation.DIVIDE,2,3));

    }






}
