package com.shauryax.method.Division;

public class DivideFloatTwoNumberUserMethod {
    public static void main(String[] args) {
        DivideFloatTwoNumberUserMethod Divide = new DivideFloatTwoNumberUserMethod();
        Divide.Division();
        Divide.DivisionByParameter(623.3f,7.2f);
        float returnValue = Divide.DivisionByReturnValue();
        System.out.println("The division is " + returnValue);
        Divide.DivisionByReturnValue();

        float ParameterReturn = Divide.DivisionByParameterAndReturnValue(241.24f,23.6f);
        System.out.println("The division is " +  ParameterReturn);
    }

    public void Division(){
        float num1 = 14.5f;
        float num2 = 2.5f;
        float division= num1 / num2;
        System.out.println("division= " + division);
    }

    public void DivisionByParameter(float num1, float num2){
        float division= num1 / num2;
        System.out.println("division= " + division);
    }

    public float DivisionByReturnValue(){
        float num1 = 54.5f;
        float num2 = 2.4f;
        float division= num1 / num2;
        return division;
    }

    public float DivisionByParameterAndReturnValue(float num1, float num2){
        float division= num1 / num2;
        return division;
    }
}
