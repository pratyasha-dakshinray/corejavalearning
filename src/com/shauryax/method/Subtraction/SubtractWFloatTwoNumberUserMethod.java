package com.shauryax.method.Subtraction;

public class SubtractWFloatTwoNumberUserMethod {
    public static void main(String[] args) {
        SubtractWFloatTwoNumberUserMethod Subtract = new SubtractWFloatTwoNumberUserMethod();
        Subtract.Subtraction();
        Subtract.SubtractionByParameter(723.6f, 18.4f);
        Float returnValue = Subtract.SubtractionByReturnValue();
        System.out.println("The subtraction is " + returnValue);
        Subtract.SubtractionByReturnValue();

        Float ParameterReturn = Subtract.SubtractionByParameterAndReturnValue(584.7f, 36.5f);
        System.out.println("The subtraction is " + ParameterReturn);
    }

    public void Subtraction(){
        Float num1 = 86.7f;
        Float num2 = 24.3f;
        Float subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public void SubtractionByParameter(Float num1, Float num2){
        Float subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public Float SubtractionByReturnValue(){
        Float num1 = 95.8f;
        Float num2 = 47.6f;
        Float subtraction = num1 - num2;
        return subtraction;
    }

    public Float SubtractionByParameterAndReturnValue(Float num1, Float num2){
        Float subtraction = num1 - num2;
        return subtraction;
    }
}
