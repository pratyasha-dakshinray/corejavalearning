package com.shauryax.testingScannerClass.Multiplication;

public class MultiplyFloatNumber {
    public void multiplication(){
        float num1 = 12.3f;
        float num2 = 12.3f;
        float multiplication = num1 * num2;
        System.out.println("multiplication = " + multiplication);
    }

    public void multiplicationByParameter(float num1, float num2){
        float multiplication = num1 * num2;
        System.out.println("multiplicationByParameter = " + multiplication);
    }

    public float multiplicationByReturnValue(){
        float num1 = 12.3f;
        float num2 = 12.3f;
        float multiplication = num1 * num2;
        System.out.println("multiplicationByReturnValue = " + multiplication);
        return multiplication;
    }
    public float multiplicationByParameterAndReturnValue(float num1, float num2){
        float multiplication = num1 * num2;
        System.out.println("multiplicationByParameterAndReturnValue = " + multiplication);
        return multiplication;
    }
}
