package com.shauryax.method.Subtraction;

public class SubtractDoubleTwoNumberUserMethod {
    public static void main(String[] args) {
        SubtractDoubleTwoNumberUserMethod Subtract = new SubtractDoubleTwoNumberUserMethod();
        Subtract.Subtraction();
        Subtract.SubtractionByParameter(846.72, 125.36);
        double returnValue = Subtract.SubtractionByReturnValue();
        System.out.println("The subtraction is " + returnValue);
        Subtract.SubtractionByReturnValue();

        double ParameterReturn = Subtract.SubtractionByParameterAndReturnValue(573.48, 216.25);
        System.out.println("The subtraction is " + ParameterReturn);
    }

    public void Subtraction(){
        double num1 = 95.7;
        double num2 = 38.4;
        double subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public void SubtractionByParameter(double num1, double num2){
        double subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public double SubtractionByReturnValue(){
        double num1 = 87.6;
        double num2 = 42.8;
        double subtraction = num1 - num2;
        return subtraction;
    }

    public double SubtractionByParameterAndReturnValue(double num1, double num2){
        double subtraction = num1 - num2;
        return subtraction;
    }
}
