package com.shauryax.Testing.Add;

public class AddWIntNumber {

    public void addition(){
        Integer num1 = 213;
        Integer num2 = 23;
        Integer sum = num1 + num2;
        System.out.println("The sum is = " + sum);
    }

    public void additionByParameter(Integer num1, Integer num2){
        Integer sum = num1 + num2;
        System.out.println("The sum is = " + sum);
    }

    public Integer additionByReturnValue(){
        Integer num1 = 2334;
        Integer num2 = 5944;
        Integer sum = num1 + num2;
        return sum;
    }

    public Integer additionByParametersAndReturnValue(Integer num1, Integer num2){
        Integer sum = num1 + num2;
        return sum;
    }
}
