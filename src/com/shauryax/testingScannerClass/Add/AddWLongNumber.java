package com.shauryax.testingScannerClass.Add;

public class AddWLongNumber {

    public void addition(){
        Long num1 = 12345L;
        Long num2 = 12345L;
        System.out.println("The sum is = " + num1 + num2);
    }

    public void additionByParameterValue(Long num1, Long num2){
        Long sum = num1 + num2;
        System.out.println("The sum is = " + sum);
    }

    public Long additionByReturnValue(){
        Long num1 = 12345L;
        Long num2 = 12345L;
        Long sum = num1 + num2;
        System.out.println("The sum is = " + sum);
        return sum;
    }

    public Long additionByParameterAndReturnValue(Long num1, Long num2){
        Long sum = num1 + num2;
        System.out.println("The sum is = " + sum);
        return sum;
    }

}
