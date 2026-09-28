package com.shauryax.method.Subtraction;

public class SubtractIntTwoNumberUserMethod {
    public static void main(String[] args) {
        SubtractIntTwoNumberUserMethod Subtract = new SubtractIntTwoNumberUserMethod();
        Subtract.Subtraction();
        Subtract.SubtractionByParameter(84672, 12536);
        int returnValue = Subtract.SubtractionByReturnValue();
        System.out.println("The subtraction is " + returnValue);
        Subtract.SubtractionByReturnValue();

        int ParameterReturn = Subtract.SubtractionByParameterAndReturnValue(57348, 21625);
        System.out.println("The subtraction is " + ParameterReturn);
    }

    public void Subtraction(){
        int num1 = 957;
        int num2 = 384;
        int subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public void SubtractionByParameter(int num1, int num2){
        int subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public int SubtractionByReturnValue(){
        int num1 = 876;
        int num2 = 428;
        int subtraction = num1 - num2;
        return subtraction;
    }

    public int SubtractionByParameterAndReturnValue(int num1, int num2){
        int subtraction = num1 - num2;
        return subtraction;
    }
}
