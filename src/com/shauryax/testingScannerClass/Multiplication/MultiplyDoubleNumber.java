package com.shauryax.testingScannerClass.Multiplication;

public class MultiplyDoubleNumber {
    public void multiplication(){
        double num1 = 233.23;
        double num2 = 12.12;
        double multiplication = num1 * num2;
        System.out.println("multiplication = " + multiplication);
    }
    public double multiplicationByReturnValue(){
        double num1 = 233.23;
        double num2 = 12.12;
        double multiplication = num1 * num2;
        System.out.println("multiplicationByReturnValue = " + multiplication);
        return multiplication;
    }

    public void multiplicationByParameter(double num1, double num2){
        double multiplication = num1 * num2;
        System.out.println("multiplicationByParameter = " + multiplication);
    }

    public void multiplicationByParameterAndReturnValue(double num1, double num2){
        double multiplication = num1 * num2;
        System.out.println("multiplicationByParameterAndReturnValue = " + multiplication);
    }
}
