package com.shauryax.Testing.Division;

public class DivisionWDoubleNumber {
    public void division(){
        Double num1 = 34.32;
        Double num2 = 38.32;
        Double division = num1 / num2;
        System.out.println("The division of two numbers are = "+division);
    }

    public void divisionByParameter(Double num1, Double num2){
        Double division = num1 / num2;
        System.out.println("The division of two numbers are = "+division);
    }

    public Double divisionByReturnValue(){
        Double num1 = 34.32;
        Double num2 = 38.32;
        Double division = num1 / num2;
        System.out.println("The division of two numbers are = "+division);
        return division;
    }

    public Double divisionByParameterAndReturnValue(Double num1, Double num2){
        Double division = num1 / num2;
        System.out.println("The division of two numbers are = "+division);
        return division;
    }
}
