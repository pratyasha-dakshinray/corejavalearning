package com.shauryax.Testing.Multiplication;

public class MultiplyWFloatNumberTest {
    public static void main(String[] args) {
        MultiplyFloatNumber multiplyFloatNumber = new MultiplyFloatNumber();

        multiplyFloatNumber.multiplication();
        multiplyFloatNumber.multiplicationByParameter(23.34f, 123.45f);
        multiplyFloatNumber.multiplicationByParameterAndReturnValue(23.34f, 123.45f);
        multiplyFloatNumber.multiplicationByReturnValue();
    }
}
