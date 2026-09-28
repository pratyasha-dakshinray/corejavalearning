package com.shauryax.method.Division;

public class DivideDoubleTwoNumberUserMethod {
    public static void main(String[] args) {
        DivideDoubleTwoNumberUserMethod Divide = new DivideDoubleTwoNumberUserMethod();
        Divide.Division();
        Divide.DivisionByParameter(623.3,7.2);
        double returnValue = Divide.DivisionByReturnValue();
        System.out.println("The division is " + returnValue);
        Divide.DivisionByReturnValue();

        double ParameterReturn = Divide.DivisionByParameterAndReturnValue(2412.4,23.8);
        System.out.println("The division is " +  ParameterReturn);
    }

    public void Division(){
        double num1 = 14.5;
        double num2 = 2.5;
        double division= num1 / num2;
        System.out.println("division= " + division);
    }

    public void DivisionByParameter(double num1, double num2){
        double division= num1 / num2;
        System.out.println("division= " + division);
    }

    public double DivisionByReturnValue(){
        double num1 = 54.5;
        double num2 = 2.4;
        double division= num1 / num2;
        return division;
    }

    public double DivisionByParameterAndReturnValue(double num1, double num2){
        double division= num1 / num2;
        return division;
    }
}
