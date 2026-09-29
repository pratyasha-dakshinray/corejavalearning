package com.shauryax.testingScannerClass.Subtraction;

public class SubtractWDoubleNumber {
    public void Subtractions(){
        Double num1 = 2323.34;
        Double num2 = 76.34;
        Double subtraction = num1 - num2;
    }

    public void SubtractionsByParameter(Double num1, Double num2){
        Double subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
    }

    public Double SubtractionsByReturnValue(){
        Double num1 = 2334.34;
        Double num2 = 76.34;
        Double subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
        return subtraction;
    }

    public Double SubtractionsByParametersAndReturnValue(Double num1, Double num2){
        Double subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
        return subtraction;
    }
}
