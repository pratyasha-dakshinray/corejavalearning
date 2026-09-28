package com.shauryax.Testing.Multiplication;

public class MultiplyLongNumber {
    public void multiplications(){
        long num1 = 12434342l;
        long num2 = 124342l;
        long multiplication = num1 * num2;
        System.out.println("multiplication is = " + multiplication);
    }

    public long multiplicationByReturnValue(){
        long num1 = 12434342l;
        long num2 = 124342l;
        long multiplication = num1 * num2;
        System.out.println("multiplicationByReturnValue is = " + multiplication);
        return multiplication;
    }

    public long multiplicationByParameterAndReturnValue(long num1, long num2){
        long multiplication = num1 * num2;
        System.out.println("multiplicationByParameterAndReturnValue is = " + multiplication);
        return multiplication;
    }

    public void multiplicationByParameter(long num1, long num2){
        long multiplication = num1 * num2;
        System.out.println("multiplicationByParameter is = " + multiplication);
    }
}
