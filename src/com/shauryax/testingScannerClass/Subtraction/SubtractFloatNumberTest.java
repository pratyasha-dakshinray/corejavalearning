package com.shauryax.testingScannerClass.Subtraction;

public class SubtractFloatNumberTest {
    public static void main(String[] args) {
        SubtractFloatNumber subtractFloatNumber = new SubtractFloatNumber();
        subtractFloatNumber.Subtractions();
        subtractFloatNumber.SubtractionsByParameter(2423.23f, 43.45f);
        subtractFloatNumber.SubtractionsByParametersAndReturnValue(2423.23f, 43.45f);
        subtractFloatNumber.SubtractionsByReturnValue();
    }
}
