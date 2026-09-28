package com.shauryax.method.Subtraction;

public class SubtractWDoubleTwoNumberUserMethod {
    public static void main(String[] args) {
        SubtractWDoubleTwoNumberUserMethod Subtract = new SubtractWDoubleTwoNumberUserMethod();
        Subtract.Subtraction();
        Subtract.SubtractionByParameter(723.65, 18.4);
        Double returnValue = Subtract.SubtractionByReturnValue();
        System.out.println("The subtraction is " + returnValue);
        Subtract.SubtractionByReturnValue();

        Double ParameterReturn = Subtract.SubtractionByParameterAndReturnValue(584.72, 36.5);
        System.out.println("The subtraction is " + ParameterReturn);
    }

    public void Subtraction(){
        Double num1 = 86.7;
        Double num2 = 24.3;
        Double subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public void SubtractionByParameter(Double num1, Double num2){
        Double subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public Double SubtractionByReturnValue(){
        Double num1 = 95.8;
        Double num2 = 47.6;
        Double subtraction = num1 - num2;
        return subtraction;
    }

    public Double SubtractionByParameterAndReturnValue(Double num1, Double num2){
        Double subtraction = num1 - num2;
        return subtraction;
    }
}
