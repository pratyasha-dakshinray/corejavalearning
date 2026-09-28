package com.shauryax.Testing.Division;

public class DivisionDoubleNumberTest {
    public static void main(String[] args) {
        DivisionDoubleNumber test = new DivisionDoubleNumber();
        test.division();
        test.divisionByReturnValue();
        test.divisionByParameterValue(23.324,1.3);
        test.divisionByParameterAndReturnValue(2144.34, 1434.324);
    }
}
