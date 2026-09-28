package com.shauryax.method.Subtraction;

public class SubtractWLongTwoNumberUserMethod {
    public static void main(String[] args) {
        SubtractWLongTwoNumberUserMethod Subtract = new SubtractWLongTwoNumberUserMethod();
        Subtract.Subtraction();
        Subtract.SubtractionByParameter(72365L, 184L);
        Long returnValue = Subtract.SubtractionByReturnValue();
        System.out.println("The subtraction is " + returnValue);
        Subtract.SubtractionByReturnValue();

        Long ParameterReturn = Subtract.SubtractionByParameterAndReturnValue(58472L, 365L);
        System.out.println("The subtraction is " + ParameterReturn);
    }

    public void Subtraction(){
        Long num1 = 867L;
        Long num2 = 243L;
        Long subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public void SubtractionByParameter(Long num1, Long num2){
        Long subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public Long SubtractionByReturnValue(){
        Long num1 = 958L;
        Long num2 = 476L;
        Long subtraction = num1 - num2;
        return subtraction;
    }

    public Long SubtractionByParameterAndReturnValue(Long num1, Long num2){
        Long subtraction = num1 - num2;
        return subtraction;
    }
}
