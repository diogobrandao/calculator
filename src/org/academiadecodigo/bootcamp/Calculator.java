package org.academiadecodigo.bootcamp;

public class Calculator {
    private String brand;
    private String color;
    private Brain brain;
    private Display display;

    public Calculator(String brand, String color) {

        this.brand = brand;
        this.color = color;
        brain = new Brain();
        display = new Display();

        int result = 0;
    }

    public int doOperation(Operation operation, int number1, int number2) {

        int result = 0;

        switch (operation) {

            case ADD:
                result = this.brain.add(number1, number2);
                this.display.showResult(result);
                break;

            case SUBTRACT:
                result = this.brain.subtract(number1, number2);
                this.display.showResult(result);
                break;

            case MULTIPLY:
                result = this.brain.multiply(number1, number2);
                this.display.showResult(result);
                break;

            case DIVIDE:
                result = this.brain.divide(number1, number2);
                this.display.showResult(result);
                break;


        }
        return result;
    }

}