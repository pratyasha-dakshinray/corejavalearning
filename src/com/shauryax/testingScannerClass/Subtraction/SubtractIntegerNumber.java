package com.shauryax.testingScannerClass.Subtraction;

public class SubtractIntegerNumber {
    public void Subtractions(){
        int num1 = 2323;
        int num2 = 76;
        int subtraction = num1 - num2;
    }

    public void SubtractionsByParameter(int num1, int num2){
        int subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
    }

    public int SubtractionsByReturnValue(){
        int num1 = 2334;
        int num2 = 76;
        int subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
        return subtraction;
    }

    public int SubtractionsByParametersAndReturnValue(int num1, int num2){
        int subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
        return subtraction;
    }
}
