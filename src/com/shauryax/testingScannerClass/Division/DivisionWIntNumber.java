package com.shauryax.testingScannerClass.Division;

public class DivisionWIntNumber {
    public void division(){
        Integer num1 = 34324;
        Integer num2 = 387894;
        Integer division = num1 / num2;
        System.out.println("The division of two numbers are = "+ division);
    }

    public Integer divisionByReturnValue(){
        Integer num1 = 34324;
        Integer num2 = 384;
        Integer division = num1 / num2;
        System.out.println("The division of two numbers are = "+ division);
        return division;
    }

    public void divisionByParameter(Integer num1, Integer num2){
        Integer division = num1 / num2;
        System.out.println("The division of two numbers are = "+ division);
    }

    public Integer divisionByParameterAndReturnValue(Integer num1,Integer num2){
        Integer division = num1 / num2;
        System.out.println("The division of two numbers are = "+ division);
        return division;
    }
}
