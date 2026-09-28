package com.shauryax.testingScannerClass.Add;

public class AddIntNumbers {
    public void addition(){
        int num1 = 3424;
        int num2 = 7687;
        int sum = num1 + num2;
        System.out.println("The sum is = " + sum);
    }

    public void additionByParameter(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum is = " + sum);
    }

    public int additionByReturnValue(){
        int num1 = 34324;
        int num2 = 27687;
        int sum = num1 + num2;
        System.out.println("The sum is = " + sum);
        return sum;
    }

    public int additionByParameterAndReturnValue(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum is = " + sum);
        return sum;
    }
}
