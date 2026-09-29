package com.shauryax.testingScannerClass.Modulous;

public class ModulusFloatNumberTest {
    public static void main(String[] args) {
        ModulusFloatNumber modulusFloatNumber = new ModulusFloatNumber();
        modulusFloatNumber.modulous();
        modulusFloatNumber.modulousByParameter(3445.45f, 54.54f);
        modulusFloatNumber.modulousByReturnValue();
        modulusFloatNumber.modulousByParameterAndReturnValue(43534.45f, 56.5f);
    }
}
