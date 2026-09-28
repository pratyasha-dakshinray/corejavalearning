package com.shauryax.Testing.Division;

public class DivisionWFloatNumber {
    public void division(){
        Float num1 = 423.34f;
        Float num2 = 66.34f;
        Float division = num1 / num2;
        System.out.println("The division of two numbers are = "+ division);
    }

    public void divisionByPrameters(Float num1, Float num2){
        Float division = num1 / num2;
        System.out.println("The division of two numbers are = "+ division);
    }

    public Float divisionByReturnValue(){
        Float num1 = 423.34f;
        Float num2 = 66.34f;
        Float division = num1 / num2;
        System.out.println("The division of two numbers are = "+ division);
        return division;
    }

    public Float divisionByParameterAndReturnValue(Float num1, Float num2){
        Float division = num1 / num2;
        System.out.println("The division of two numbers are = "+ division);
        return division;
    }

}
