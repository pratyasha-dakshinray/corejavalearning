package com.shauryax.testingScannerClass.Subtraction;

public class SubtractDoubleNumber {
    public void Subtractions(){
        double num1 = 2323.34;
        double num2 = 76.34;
        double subtraction = num1 - num2;
    }

    public void SubtractionsByParameter(double num1, double num2){
        double subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = "+subtraction);
    }

    public double SubtractionsByReturnValue(){
        double num1 = 2334.34;
        double num2 = 76.34;
        double subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = "+subtraction);
        return subtraction;
    }

    public double SubtractionsByParametersAndReturnValue(double num1, double num2){
        double subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = "+subtraction);
        return subtraction;
    }
}
