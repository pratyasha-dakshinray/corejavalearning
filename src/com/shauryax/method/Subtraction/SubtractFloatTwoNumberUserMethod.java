package com.shauryax.method.Subtraction;

public class SubtractFloatTwoNumberUserMethod {
    public static void main(String[] args) {
        SubtractFloatTwoNumberUserMethod Subtract = new SubtractFloatTwoNumberUserMethod();
        Subtract.Subtraction();
        Subtract.SubtractionByParameter(846.7f, 125.3f);
        float returnValue = Subtract.SubtractionByReturnValue();
        System.out.println("The subtraction is " + returnValue);
        Subtract.SubtractionByReturnValue();

        float ParameterReturn = Subtract.SubtractionByParameterAndReturnValue(573.4f, 216.2f);
        System.out.println("The subtraction is " + ParameterReturn);
    }

    public void Subtraction(){
        float num1 = 95.7f;
        float num2 = 38.4f;
        float subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public void SubtractionByParameter(float num1, float num2){
        float subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public float SubtractionByReturnValue(){
        float num1 = 87.6f;
        float num2 = 42.8f;
        float subtraction = num1 - num2;
        return subtraction;
    }

    public float SubtractionByParameterAndReturnValue(float num1, float num2){
        float subtraction = num1 - num2;
        return subtraction;
    }
}
