package com.shauryax.Testing.Division;

public class DivisionLongNumber {
    public void division(){
        long num1 = 3343445l;
        long num2 = 34568796l;
        long division = num1 / num2;
        System.out.println("The division of two numbers are = " + division);
    }

    public long divisionByReturnValue(){
        long num1 = 3343445l;
        long num2 = 3456l;
        long division = num1 / num2;
        System.out.println("The division of two numbers are = " + division);
        return division;
    }

    public void divisionByParameter(long num1, long num2){
        long division = num1 / num2;
        System.out.println("The division of two numbers are = " + division);

    }

    public long divisionByParameterAndReturnValue(long num1, long num2){
        long division = num1 / num2;
        System.out.println("The division of two numbers are = " + division);
        return division;
    }
}
