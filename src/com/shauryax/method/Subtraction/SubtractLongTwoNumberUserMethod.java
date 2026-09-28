package com.shauryax.method.Subtraction;

public class SubtractLongTwoNumberUserMethod {
    public static void main(String[] args) {
        SubtractLongTwoNumberUserMethod Subtract = new SubtractLongTwoNumberUserMethod();
        Subtract.Subtraction();
        Subtract.SubtractionByParameter(84672L, 12536L);
        long returnValue = Subtract.SubtractionByReturnValue();
        System.out.println("The subtraction is " + returnValue);
        Subtract.SubtractionByReturnValue();

        long ParameterReturn = Subtract.SubtractionByParameterAndReturnValue(57348L, 21625L);
        System.out.println("The subtraction is " + ParameterReturn);
    }

    public void Subtraction(){
        long num1 = 957L;
        long num2 = 384L;
        long subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public void SubtractionByParameter(long num1, long num2){
        long subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public long SubtractionByReturnValue(){
        long num1 = 876L;
        long num2 = 428L;
        long subtraction = num1 - num2;
        return subtraction;
    }

    public long SubtractionByParameterAndReturnValue(long num1, long num2){
        long subtraction = num1 - num2;
        return subtraction;
    }
}
