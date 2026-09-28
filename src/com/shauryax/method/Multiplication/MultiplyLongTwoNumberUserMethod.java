package com.shauryax.method.Multiplication;

public class MultiplyLongTwoNumberUserMethod {
    public static void main(String[] args) {
        MultiplyLongTwoNumberUserMethod Multiply = new MultiplyLongTwoNumberUserMethod();
        Multiply.Multiplication();
        Multiply.MultiplicationByParameter(6847L, 126L);
        long returnValue = Multiply.MultiplicationByReturnValue();
        System.out.println("The multiplication is " + returnValue);
        Multiply.MultiplicationByReturnValue();

        long ParameterReturn = Multiply.MultiplicationByParameterAndReturnValue(3274L, 157L);
        System.out.println("The multiplication is " + ParameterReturn);
    }

    public void Multiplication(){
        long num1 = 456L;
        long num2 = 78L;
        long multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public void MultiplicationByParameter(long num1, long num2){
        long multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public long MultiplicationByReturnValue(){
        long num1 = 835L;
        long num2 = 64L;
        long multiplication = num1 * num2;
        return multiplication;
    }

    public long MultiplicationByParameterAndReturnValue(long num1, long num2){
        long multiplication = num1 * num2;
        return multiplication;
    }
}
