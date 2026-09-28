package com.shauryax.method.Division;

public class DivideWIntegerTwoNumberUserMethod {
    public static void main(String[] args) {
        DivideWIntTwoNumberUserMethod Divide = new DivideWIntTwoNumberUserMethod();
        Divide.Division();
        Divide.DivisionByParameter(623,7);
        int returnValue = Divide.DivisionByReturnValue();
        System.out.println("The division is " + returnValue);
        Divide.DivisionByReturnValue();

        int ParameterReturn = Divide.DivisionByParameterAndReturnValue(24124,23);
        System.out.println("The division is " +  ParameterReturn);
    }

    public void Division(){
        int num1 = 145;
        int num2 = 25;
        int division= num1 + num2;
        System.out.println("division= " + division);
    }

    public void DivisionByParameter(int num1, int num2){
        int division= num1 + num2;
        System.out.println("division= " + division);
    }

    public int DivisionByReturnValue(){
        int num1 = 545;
        int num2 = 24;
        int division= num1 + num2;
        return division;
    }

    public int DivisionByParameterAndReturnValue(int num1, int num2){
        int division= num1 + num2;
        return division;
    }
}
