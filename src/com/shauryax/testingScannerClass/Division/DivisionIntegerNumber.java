package com.shauryax.testingScannerClass.Division;

public class DivisionIntegerNumber {
    public void division(){
        int num1 = 334;
        int num2 = 234;
        int division = num1 / num2;
        System.out.println("The division of two numbers are = " + division);
    }

    public int divisionByReturnValue(){
        int num1 = 334;
        int num2 = 234;
        int division = num1 / num2;
        System.out.println("The division of two numbers are = " + division);
        return division;
    }

    public int divisionByParameterAndReturnValue(int num1, int num2){
        int division = num1 / num2;
        System.out.println("The division of two numbers are = " + division);
        return division;
    }

    public void divisionByParameter(int num1, int num2){
        int division = num1 / num2;
        System.out.println("The division of two numbers are = " + division);
    }
}
