package com.shauryax.method.Multiplication;

public class MultiplyWFloatTwoNumberUserMethod {
    public static void main(String[] args) {
        MultiplyWFloatTwoNumberUserMethod Multiply = new MultiplyWFloatTwoNumberUserMethod();
        Multiply.Multiplication();
        Multiply.MultiplicationByParameter(723.6f, 8.5f);
        Float returnValue = Multiply.MultiplicationByReturnValue();
        System.out.println("The multiplication is " + returnValue);
        Multiply.MultiplicationByReturnValue();

        Float ParameterReturn = Multiply.MultiplicationByParameterAndReturnValue(384.7f, 16.4f);
        System.out.println("The multiplication is " + ParameterReturn);
    }

    public void Multiplication(){
        Float num1 = 56.8f;
        Float num2 = 4.2f;
        Float multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public void MultiplicationByParameter(Float num1, Float num2){
        Float multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public Float MultiplicationByReturnValue(){
        Float num1 = 92.5f;
        Float num2 = 3.7f;
        Float multiplication = num1 * num2;
        return multiplication;
    }

    public Float MultiplicationByParameterAndReturnValue(Float num1, Float num2){
        Float multiplication = num1 * num2;
        return multiplication;
    }
}
