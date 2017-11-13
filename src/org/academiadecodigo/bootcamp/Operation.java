package org.academiadecodigo.bootcamp;

public enum Operation {

    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("x"),
    DIVIDE("/");


    private String symbol;

    Operation(String symbol){

    }

    public String getSymbol(){
        return this.symbol;

    }

    public static String showOperations() {
        String result = "Available Operations: ";

                for(Operation operation : Operation.values()) {
                result += operation.symbol + " ";
                }
                return result;
    }

}


