package com.shauryax.testingScannerClass.Add;

public class AddWIntNumberTest {
    public static void main(String[] args) {
        AddWIntNumber test = new AddWIntNumber();
        test.addition();

        test.additionByReturnValue();

        test.additionByParameter(2343424, 1213);

        test.additionByParametersAndReturnValue(2432564, 326466);
    }
}
