package com.shauryax.testingScannerClass.Add;

public class AddWLongNumberTest {
    public static void main(String[] args) {
        AddWLongNumber test = new AddWLongNumber();
        test.addition();
        test.additionByReturnValue();
        test.additionByParameterValue(1234565l, 457698765l);
        test.additionByParameterAndReturnValue(12333333334l, 654322355l);

    }
}
