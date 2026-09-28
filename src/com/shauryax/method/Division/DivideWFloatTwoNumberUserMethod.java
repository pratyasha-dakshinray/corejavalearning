package com.shauryax.method.Division;

public class DivideWFloatTwoNumberUserMethod {
    public static void main(String[] args) {
        DivideFloatTwoNumberUserMethod Divide = new DivideFloatTwoNumberUserMethod();
        Divide.Division();
        Divide.DivisionByParameter(623.3f,7.2f);
        Float returnValue = Divide.DivisionByReturnValue();
        System.out.println("The division is " + returnValue);
        Divide.DivisionByReturnValue();

        Float ParameterReturn = Divide.DivisionByParameterAndReturnValue(24124,23);
        System.out.println("The division is " +  ParameterReturn);
    }

    public void Division(){
        Float num1 = 14.5f;
        Float num2 = 2.5f;
        Float division= num1 + num2;
        System.out.println("division= " + division);
    }

    public void DivisionByParameter(Float num1, Float num2){
        Float division= num1 + num2;
        System.out.println("division= " + division);
    }

    public Float DivisionByReturnValue(){
        Float num1 = 54.5f;
        Float num2 = 2.4f;
        Float division= num1 + num2;
        return division;
    }

    public Float DivisionByParameterAndReturnValue(Float num1, Float num2){
        Float division= num1 + num2;
        return division;
    }
}
