package com.shauryax.Testing.Add;

public class AddIntegerNumberTest {
    public static void main(String[] args) {
        AddIntegerNumber test  = new AddIntegerNumber();
        test.addition();

        test.additionByParameter(32, 34);

        int returnValue = test.additionByReturnValue();


        int ParameterReturnValue = test.additionByParameterAndReturnValue(32, 34);

    }
}
