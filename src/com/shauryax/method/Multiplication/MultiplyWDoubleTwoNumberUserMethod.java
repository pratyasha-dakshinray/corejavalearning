package com.shauryax.method.Multiplication;

public class MultiplyWDoubleTwoNumberUserMethod {
    public static void main(String[] args) {
        MultiplyWDoubleTwoNumberUserMethod Multiply = new MultiplyWDoubleTwoNumberUserMethod();
        Multiply.Multiplication();
        Multiply.MultiplicationByParameter(723.65, 8.5);
        Double returnValue = Multiply.MultiplicationByReturnValue();
        System.out.println("The multiplication is " + returnValue);
        Multiply.MultiplicationByReturnValue();

        Double ParameterReturn = Multiply.MultiplicationByParameterAndReturnValue(384.72, 16.4);
        System.out.println("The multiplication is " + ParameterReturn);
    }

    public void Multiplication(){
        Double num1 = 56.8;
        Double num2 = 4.2;
        Double multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public void MultiplicationByParameter(Double num1, Double num2){
        Double multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public Double MultiplicationByReturnValue(){
        Double num1 = 92.5;
        Double num2 = 3.7;
        Double multiplication = num1 * num2;
        return multiplication;
    }

    public Double MultiplicationByParameterAndReturnValue(Double num1, Double num2){
        Double multiplication = num1 * num2;
        return multiplication;
    }
}
