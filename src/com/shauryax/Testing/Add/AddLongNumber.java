package com.shauryax.Testing.Add;

public class AddLongNumber {

    public void addition(){
        long num1 = 343242324;
        long num2 = 276873334;
        long sum = num1 + num2;
        System.out.println("The sum is = " + sum);
    }

    public void additionByParameter(long num1, long num2){
        long sum = num1 + num2;
        System.out.println("The sum is = " + sum);
    }

    public long additionByReturnValue(){
        long num1 = 23456768;
        long num2 = 2134567090;
        long sum = num1 + num2;
        System.out.println("The sum is = " + sum);
        return sum;
    }

    public long additionByParametersAndReturnValue(long num1, long num2){
        long sum = num1 + num2;
        System.out.println("The sum is = " + sum);
        return sum;
    }
}
