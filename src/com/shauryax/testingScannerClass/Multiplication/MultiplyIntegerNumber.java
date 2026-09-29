package com.shauryax.testingScannerClass.Multiplication;

public class MultiplyIntegerNumber {
    public void multiplications(){
        int num1 = 2334;
        int num2 = 1242;
        int multiplication = num1 * num2;
        System.out.println("multiplication =  " + multiplication);
    }

    public int multiplicationByReturnValue(){
        int num1 = 2334;
        int num2 = 1242;
        int multiplication = num1 * num2;
        System.out.println("multiplicationByReturnValue =  " + multiplication);
        return multiplication;
    }
    public void multiplicationByParameter( int num1, int num2){
        int multiplication = num1 * num2;
        System.out.println("multiplicationByParameter =  " + multiplication);
    }

    public int multiplicationByParameterAndReturnValue(int num1, int num2){
        int multiplication = num1 * num2;
        System.out.println("multiplicationByParameterAndReturnValue =  " + multiplication);
        return multiplication;
    }
}
