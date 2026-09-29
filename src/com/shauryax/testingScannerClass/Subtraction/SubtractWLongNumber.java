package com.shauryax.testingScannerClass.Subtraction;

public class SubtractWLongNumber {
    public void Subtractions(){
        Long num1 = 2323L;
        Long num2 = 76L;
        Long subtraction = num1 - num2;
    }

    public void SubtractionsByParameter(Long num1, Long num2){
        Long subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
    }

    public Long SubtractionsByReturnValue(){
        Long num1 = 2334L;
        Long num2 = 76L;
        Long subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
        return subtraction;
    }

    public Long SubtractionsByParametersAndReturnValue(Long num1, Long num2){
        Long subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
        return subtraction;
    }
}
