package com.shauryax.testingScannerClass.Add;

public class AddWFloatNumber {
    public void addition(){
        Float num1 = 10.0f;
        Float num2 = 20.0f;
        Float sum = num1 + num2;
        System.out.println("The sum is = " + sum);
    }

    public void additionByparameters(Float num1, Float num2){
        Float sum = num1 + num2;
        System.out.println("The sum is = " + sum);
    }

    public Float additionByReturnValue(){
        Float num1 = 10.0f;
        Float num2 = 20.0f;
        Float sum = num1 + num2;
        System.out.println("The sum is = " + sum);
        return sum;
    }

    public Float additionByReturnValueByparameters(Float num1, Float num2) {
        Float sum = num1 + num2;
        System.out.println("The sum is = " + sum);
        return sum;
    }
}
