package com.shauryax.testingScannerClass.Subtraction;

public class SubtractFloatNumber {
    public void Subtractions(){
        float num1 = 2323.34f;
        float num2 = 76.34f;
        float subtraction = num1 - num2;
    }

    public void SubtractionsByParameter(float num1, float num2){
        float subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
    }

    public float SubtractionsByReturnValue(){
        float num1 = 2334.34f;
        float num2 = 76.34f;
        float subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
        return subtraction;
    }

    public float SubtractionsByParametersAndReturnValue(float num1, float num2){
        float subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
        return subtraction;
    }
}
