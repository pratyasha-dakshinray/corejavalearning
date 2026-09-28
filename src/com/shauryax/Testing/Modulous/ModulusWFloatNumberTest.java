package com.shauryax.Testing.Modulous;

public class ModulusWFloatNumberTest {
    public static void main(String[] args) {
        ModulusWFloatNumber modulusWFloatNumber= new ModulusWFloatNumber();
        modulusWFloatNumber.modulus();
        modulusWFloatNumber.modulusByReturnValue();
        modulusWFloatNumber.modulusByParameter(2334.45f, 4334.45f);
        modulusWFloatNumber.modulusByParameterAndReturnValue(3243.34f, 34242.45f);
    }
}
