package com.shauryax.testingScannerClass.Add;

public class AddWDoubleNumber  {

    public void addition(){
        Double num1 = 2334.243;
        Double num2 = 23424.324;
        Double sum = num1 + num2;
        System.out.println("The sum is = " + sum);
    }

    public Double additionByReturnValue(){
        Double num1 = 2334.243;
        Double num2 = 23424.324;
        Double sum = num1 + num2;
        System.out.println("The sum is = " + sum);
        return sum;
    }

    public void additionByParameters(Double num1, Double num2){
        Double sum = num1 + num2;
        System.out.println("The sum is = " + sum);
    }

    public Double additionByParametersAndReturnValue(Double num1, Double num2){
        Double sum = num1 + num2;
        System.out.println("The sum is = " + sum);
        return sum;
    }
}
