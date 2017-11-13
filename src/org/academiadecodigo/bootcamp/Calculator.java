package org.academiadecodigo.bootcamp;

import java.awt.*;
import java.util.concurrent.SynchronousQueue;

public class Calculator {

    private String brand;
    private String color;

private Operation operation;

    public int doOperation(Operation operation, int number1, int number2) {

        int result = 0;

        switch (operation){

        case ADD:
            result = add(number1, number2 );
            System.out.println("add...");
            break;

        case SUBTRACT:
            result = subtract(number1,number2 );
            System.out.println("subtract...");
            break;

        case MULTIPLY:
            result = multiply(number1,number2);
            System.out.println("multiply...");
            break;

        case DIVIDE:
            result = divide(number1, number2);
            System.out.println("the division...");
            break;

    }

        return result;
    }

    private int add(int number1, int number2) {
          return number1 + number2;

    }

    private int subtract(int number1, int number2) {
          return number1 - number2;

    }

    private int multiply(int number1, int number2) {
          return number1 * number2;
    }

    private int divide(int number1, int number2) {
          return number1 / number2;
    }



}


