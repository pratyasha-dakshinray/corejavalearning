package com.shauryax.testingScannerClass.Multiplication;

public class MultiplyLongNumberTest {
    public static void main(String[] args) {
        MultiplyLongNumber multiplyLongNumber = new MultiplyLongNumber();
        multiplyLongNumber.multiplications();
        multiplyLongNumber.multiplicationByParameter(2334, 1242);
        multiplyLongNumber.multiplicationByParameterAndReturnValue(1242, 2334);
        multiplyLongNumber.multiplicationByReturnValue();
    }
}
