package com.shauryax.Testing.Add;

public class AddWDoubleNumberTest {
    public static void main(String[] args) {
        AddWDoubleNumber test = new AddWDoubleNumber();

        test.addition();

        test.additionByParameters(22.235, 324.214);

        test.additionByParametersAndReturnValue(22.235, 324.214);

        test.additionByReturnValue();
    }
}
