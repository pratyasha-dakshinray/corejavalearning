package com.shauryax.Testing.Subtraction;

public class SubtractWIntNumber {
    public void Subtractions(){
        Integer num1 = 2323;
        Integer num2 = 76;
        Integer subtraction = num1 - num2;
    }

    public void SubtractionsByParameter(Integer num1, Integer num2){
        Integer subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
    }

    public Integer SubtractionsByReturnValue(){
        Integer num1 = 2334;
        Integer num2 = 76;
        Integer subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
        return subtraction;
    }

    public Integer SubtractionsByParametersAndReturnValue(Integer num1, Integer num2){
        Integer subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers is = " + subtraction);
        return subtraction;
    }
}
