package org.academiadecodigo.bootcamp;

public class Calculator {

    private String brand;
    private String color;

    public Calculator(String brand, String color) {
        this.brand = brand;
        this.color = color;



    }
// the math

    public int add(int number1, int number2) {

        return number1 + number2;

    }

    public int subtract(int number1, int number2) {

        return number1 - number2;

    }

    public int multiply(int number1, int number2) {

        return number1 * number2;
    }

    public int divide(int number1, int number2) {

        return number1 / number2;
    }
// get and set
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }






}


