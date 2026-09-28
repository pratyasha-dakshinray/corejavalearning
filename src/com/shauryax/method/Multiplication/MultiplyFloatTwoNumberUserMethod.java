package com.shauryax.method.Multiplication;

public class MultiplyFloatTwoNumberUserMethod {
    public static void main(String[] args) {
        MultiplyFloatTwoNumberUserMethod Multiply = new MultiplyFloatTwoNumberUserMethod();
        Multiply.Multiplication();
        Multiply.MultiplicationByParameter(684.7f, 12.6f);
        float returnValue = Multiply.MultiplicationByReturnValue();
        System.out.println("The multiplication is " + returnValue);
        Multiply.MultiplicationByReturnValue();

        float ParameterReturn = Multiply.MultiplicationByParameterAndReturnValue(327.4f, 15.7f);
        System.out.println("The multiplication is " + ParameterReturn);
    }

    public void Multiplication(){
        float num1 = 45.6f;
        float num2 = 7.8f;
        float multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public void MultiplicationByParameter(float num1, float num2){
        float multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public float MultiplicationByReturnValue(){
        float num1 = 83.5f;
        float num2 = 6.4f;
        float multiplication = num1 * num2;
        return multiplication;
    }

    public float MultiplicationByParameterAndReturnValue(float num1, float num2){
        float multiplication = num1 * num2;
        return multiplication;
    }
}
