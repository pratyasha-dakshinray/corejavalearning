package com.shauryax.Testing.Division;

public class DivisionFloatNumberTest {
    public static void main(String[] args) {
        DivisionFloatNumber test = new DivisionFloatNumber();

        test.division();
        test.divisionByReturnValue();
        test.divisionByParameter(23.34f, 322.223f);
        test.divisionByParameterAndReturnValue(213.33f, 213.34f);
    }
}
