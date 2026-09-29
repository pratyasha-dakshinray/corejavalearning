package com.shauryax.testingScannerClass.Multiplication;

public class MultiplyWIntNumber {
    public void multiplication(){
        Integer num1 = 2334;
        Integer num2 = 1242;
        Integer multiplication = num1 * num2;
        System.out.println("multiplication =  " + multiplication);
    }

    public Integer multiplicationByReturnValue(){
        Integer num1 = 2334;
        Integer num2 = 1242;
        Integer multiplication = num1 * num2;
        System.out.println("multiplicationByReturnValue =  " + multiplication);
        return multiplication;
    }
    public void multiplicationByParameter( Integer num1, Integer num2){
        Integer multiplication = num1 * num2;
        System.out.println("multiplicationByParameter =  " + multiplication);
    }

    public Integer multiplicationByParameterAndReturnValue(Integer num1, Integer num2){
        Integer multiplication = num1 * num2;
        System.out.println("multiplicationByParameterAndReturnValue =  " + multiplication);
        return multiplication;
    }
}
