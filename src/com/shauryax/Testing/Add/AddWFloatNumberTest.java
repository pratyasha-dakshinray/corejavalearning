package com.shauryax.Testing.Add;

public class AddWFloatNumberTest {
    public static void main(String[] args) {
        AddWFloatNumber test = new AddWFloatNumber();
        test.additionByReturnValue();
        test.addition();
        test.additionByparameters(23.23f,324.34f);
        test.additionByReturnValueByparameters(234.45f, 3435.5f);
    }
}
