package com.shauryax.method.Multiplication;

public class MultiplyWLongTwoNumberUserMethod {
    public static void main(String[] args) {
        MultiplyWLongTwoNumberUserMethod Multiply = new MultiplyWLongTwoNumberUserMethod();
        Multiply.Multiplication();
        Multiply.MultiplicationByParameter(72365L, 85L);
        Long returnValue = Multiply.MultiplicationByReturnValue();
        System.out.println("The multiplication is " + returnValue);
        Multiply.MultiplicationByReturnValue();

        Long ParameterReturn = Multiply.MultiplicationByParameterAndReturnValue(38472L, 164L);
        System.out.println("The multiplication is " + ParameterReturn);
    }

    public void Multiplication(){
        Long num1 = 568L;
        Long num2 = 42L;
        Long multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public void MultiplicationByParameter(Long num1, Long num2){
        Long multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public Long MultiplicationByReturnValue(){
        Long num1 = 925L;
        Long num2 = 37L;
        Long multiplication = num1 * num2;
        return multiplication;
    }

    public Long MultiplicationByParameterAndReturnValue(Long num1, Long num2){
        Long multiplication = num1 * num2;
        return multiplication;
    }
}
