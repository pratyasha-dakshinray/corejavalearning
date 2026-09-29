package com.shauryax.testingScannerClass.Subtraction;

public class SubtractWFloatNumber {
    public void Subtractions(){
        Float num1 = 2323.34f;
        Float num2 = 76.34f;
        Float subtraction = num1 - num2;
    }

    public void SubtractionsByParameter(Float num1, Float num2){
        Float subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
    }

    public Float SubtractionsByReturnValue(){
        Float num1 = 2334.34f;
        Float num2 = 76.34f;
        Float subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
        return subtraction;
    }

    public Float SubtractionsByParametersAndReturnValue(Float num1, Float num2){
        Float subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
        return subtraction;
    }
}
