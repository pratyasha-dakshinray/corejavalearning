package com.shauryax.method.Multiplication;

public class MultiplyDoubleTwoNumberUserMethod {
    public static void main(String[] args) {
        MultiplyDoubleTwoNumberUserMethod Multiply = new MultiplyDoubleTwoNumberUserMethod();
        Multiply.Multiplication();
        Multiply.MultiplicationByParameter(684.75, 12.6);
        double returnValue = Multiply.MultiplicationByReturnValue();
        System.out.println("The multiplication is " + returnValue);
        Multiply.MultiplicationByReturnValue();

        double ParameterReturn = Multiply.MultiplicationByParameterAndReturnValue(327.48, 15.7);
        System.out.println("The multiplication is " + ParameterReturn);
    }

    public void Multiplication(){
        double num1 = 45.6;
        double num2 = 7.8;
        double multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public void MultiplicationByParameter(double num1, double num2){
        double multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public double MultiplicationByReturnValue(){
        double num1 = 83.5;
        double num2 = 6.4;
        double multiplication = num1 * num2;
        return multiplication;
    }

    public double MultiplicationByParameterAndReturnValue(double num1, double num2){
        double multiplication = num1 * num2;
        return multiplication;
    }
}
