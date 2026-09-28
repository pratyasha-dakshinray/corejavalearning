package com.shauryax.Testing.Add;

public class AddDoubleNumberTest {
    public static void main(String[] args) {
        AddDoubleNumber test = new AddDoubleNumber();

        test.addition();

        test.additionByParameter(23.32, 231.234);

        double returnValue = test.additionByReturnValue();
        System.out.println("The sum is = " + returnValue);

        double parameterReturnValue = test.additionParameterAndByReturnValue(213.324, 4123.34);
        System.out.println("The sum is = " +parameterReturnValue);
    }
}
