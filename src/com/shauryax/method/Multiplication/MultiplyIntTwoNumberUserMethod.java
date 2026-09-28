package com.shauryax.method.Multiplication;

public class MultiplyIntTwoNumberUserMethod {
    public static void main(String[] args) {
        MultiplyIntTwoNumberUserMethod Multiply = new MultiplyIntTwoNumberUserMethod();
        Multiply.Multiplication();
        Multiply.MultiplicationByParameter(6847, 126);
        int returnValue = Multiply.MultiplicationByReturnValue();
        System.out.println("The multiplication is " + returnValue);
        Multiply.MultiplicationByReturnValue();

        int ParameterReturn = Multiply.MultiplicationByParameterAndReturnValue(3274, 157);
        System.out.println("The multiplication is " + ParameterReturn);
    }

    public void Multiplication(){
        int num1 = 456;
        int num2 = 78;
        int multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public void MultiplicationByParameter(int num1, int num2){
        int multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public int MultiplicationByReturnValue(){
        int num1 = 835;
        int num2 = 64;
        int multiplication = num1 * num2;
        return multiplication;
    }

    public int MultiplicationByParameterAndReturnValue(int num1, int num2){
        int multiplication = num1 * num2;
        return multiplication;
    }
}
