package com.shauryax.testingScannerClass.Multiplication;

public class MultiplyWDoubleNumberTest {
    public static void main(String[] args) {
        MultiplyDoubleNumber multiplyDoubleNumber  = new MultiplyDoubleNumber();
        multiplyDoubleNumber.multiplicationByParameter(34.31,23.4);
        multiplyDoubleNumber.multiplication();
        multiplyDoubleNumber.multiplicationByParameterAndReturnValue(2132.21, 1242.34);
        multiplyDoubleNumber.multiplicationByReturnValue();
    }
}
