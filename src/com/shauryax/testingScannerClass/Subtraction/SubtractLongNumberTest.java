package com.shauryax.testingScannerClass.Subtraction;

public class SubtractLongNumberTest {
    public static void main(String[] args) {
        SubtractLongNumber subtractLongNumber = new SubtractLongNumber();
        subtractLongNumber.Subtractions();
        subtractLongNumber.SubtractionsByParameter(2423L, 43L);
        subtractLongNumber.SubtractionsByParametersAndReturnValue(2423L, 43L);
        subtractLongNumber.SubtractionsByReturnValue();
    }
}
