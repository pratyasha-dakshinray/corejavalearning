package com.shauryax.Testing.Add;

public class AddLongNumberTest {
    public static void main(String[] args) {
        AddLongNumber test = new AddLongNumber();

        test.addition();

        test.additionByParameter(2114325l, 3432545l);

        long returnValue = test.additionByReturnValue();

        long parameterReturnValue = test.additionByParametersAndReturnValue(3225245435l, 343434534534l);

    }
}
