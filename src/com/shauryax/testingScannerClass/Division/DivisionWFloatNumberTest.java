package com.shauryax.testingScannerClass.Division;

public class DivisionWFloatNumberTest {
    public static void main(String[] args) {
        DivisionWFloatNumber test = new DivisionWFloatNumber();
        test.division();
        test.divisionByReturnValue();
        test.divisionByPrameters(234.34f, 324.35f);
        test.divisionByParameterAndReturnValue(232.34f, 2434.43f);
    }
}
