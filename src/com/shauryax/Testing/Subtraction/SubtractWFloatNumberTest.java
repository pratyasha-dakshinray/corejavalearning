package com.shauryax.Testing.Subtraction;

public class SubtractWFloatNumberTest {
    public static void main(String[] args) {
        SubtractWFloatNumber subtractWFloatNumber = new SubtractWFloatNumber();
        subtractWFloatNumber.Subtractions();
        subtractWFloatNumber.SubtractionsByParameter(2423.23f, 43.45f);
        subtractWFloatNumber.SubtractionsByParametersAndReturnValue(2423.23f, 43.45f);
        subtractWFloatNumber.SubtractionsByReturnValue();
    }
}
