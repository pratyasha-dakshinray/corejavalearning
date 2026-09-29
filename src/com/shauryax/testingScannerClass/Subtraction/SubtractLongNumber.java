package com.shauryax.testingScannerClass.Subtraction;

public class SubtractLongNumber {
    public void Subtractions(){
        long num1 = 2323L;
        long num2 = 76L;
        long subtraction = num1 - num2;
    }

    public void SubtractionsByParameter(long num1, long num2){
        long subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
    }

    public long SubtractionsByReturnValue(){
        long num1 = 2334L;
        long num2 = 76L;
        long subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
        return subtraction;
    }

    public long SubtractionsByParametersAndReturnValue(long num1, long num2){
        long subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
        return subtraction;
    }
}
