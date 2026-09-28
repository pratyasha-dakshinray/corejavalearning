package com.shauryax.Testing.Division;

public class DivisionDoubleNumber {
    public void division(){
        double num1 = 12.34;
        double num2 = 12.34;
        double division = num1 / num2;
        System.out.println("The division of two numbers are = " + division);
    }

    public double divisionByReturnValue(){
        double num1 = 12.34;
        double num2 = 12.34;
        double division = num1 / num2;
        System.out.println("The division of two numbers are = " + division);
        return division;
    }

    public void divisionByParameterValue(double num1, double num2){
        double division = num1 / num2;
        System.out.println("The division of two numbers are = " + division);
    }

    public double divisionByParameterAndReturnValue(double num1, double num2){
        double division = num1 / num2;
        System.out.println("The division of two numbers are = " + division);
        return division;
    }
}
