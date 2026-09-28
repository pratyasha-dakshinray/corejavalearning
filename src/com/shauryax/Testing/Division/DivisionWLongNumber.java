package com.shauryax.Testing.Division;

public class DivisionWLongNumber {
    public void division(){
        Long num1 = 2342434l;
        Long num2 = 342l;
        Long Division = num1 / num2;
        System.out.println("The division of two numbers are = "+ Division);
    }

    public Long divisionByReturnValue(){
        Long num1 = 2342434l;
        Long num2 = 34l;
        Long Division = num1 / num2;
        System.out.println("The division of two numbers are = "+ Division);
        return Division;
    }

    public Long divisionByParameterAndReturnValue(Long num1,Long num2){
        Long Division = num1 / num2;
        System.out.println("The division of two numbers are = "+ Division);
        return Division;
    }

    public void divisionByParameter(Long num1,Long num2){
        Long Division = num1 / num2;
        System.out.println("The division of two numbers are = "+ Division);
    }
}
