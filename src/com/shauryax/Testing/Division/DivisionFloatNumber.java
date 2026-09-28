package com.shauryax.Testing.Division;

public class DivisionFloatNumber {
    public void division() {
        float num1 = 23.45f;
        float num2 = 45.45f;
        float division = num1 / num2;
        System.out.println("The division of two number is = " + division);
    }

    public void divisionByParameter(float num1, float num2) {
        float num3 = num1 / num2;
        System.out.println("The division of two number is = " + num3);
    }

    public float divisionByReturnValue() {
        float num1 = 23.45f;
        float num2 = 45.45f;
        float division = num1 / num2;
        System.out.println("The division of two number is = " + division);
        return division;
    }

    public float divisionByParameterAndReturnValue(float num1, float num2) {
        float division = num1 / num2;
        System.out.println("The division of two number is = " + division);
        return division;
    }
}

