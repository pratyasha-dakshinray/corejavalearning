package com.shauryax.method.Multiplication;

public class MultiplyWIntTwoNumberUserMethod {
    public static void main(String[] args) {
        MultiplyWIntTwoNumberUserMethod Multiply = new MultiplyWIntTwoNumberUserMethod();
        Multiply.Multiplication();
        Multiply.MultiplicationByParameter(7236, 85);
        Integer returnValue = Multiply.MultiplicationByReturnValue();
        System.out.println("The multiplication is " + returnValue);
        Multiply.MultiplicationByReturnValue();

        Integer ParameterReturn = Multiply.MultiplicationByParameterAndReturnValue(3847, 164);
        System.out.println("The multiplication is " + ParameterReturn);
    }

    public void Multiplication(){
        Integer num1 = 568;
        Integer num2 = 42;
        Integer multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public void MultiplicationByParameter(Integer num1, Integer num2){
        Integer multiplication = num1 * num2;
        System.out.println("multiplication= " + multiplication);
    }

    public Integer MultiplicationByReturnValue(){
        Integer num1 = 925;
        Integer num2 = 37;
        Integer multiplication = num1 * num2;
        return multiplication;
    }

    public Integer MultiplicationByParameterAndReturnValue(Integer num1, Integer num2){
        Integer multiplication = num1 * num2;
        return multiplication;
    }
}
