package com.shauryax.Testing.Add;

public class AddFloatNumberTest {
    public static void main(String[] args) {
        AddFloatNumber test = new AddFloatNumber();
        test.addition();

        test.additionByParameter(23.4f, 234.34f);

        float returnValue = test.additionByReturnValue();
        System.out.println("The addition is = " + returnValue);

        float parameterReturnValue = test.additionByParameterAndReturnValue(23423.4f, 24.46f);
        System.out.println("The addition is = " + parameterReturnValue);
    }
}
