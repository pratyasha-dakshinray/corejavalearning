package com.shauryax.testingScannerClass.Modulous;

public class ModulusWDoubleNumber {
    public void modulus() {
        Double num1 = 3223.33;
        Double num2 = 53.33;
        Double modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
    }

    public void modulusByParameter(Double num1, Double num2) {
        Double modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
    }

    public Double modulusByReturnValue() {
        Double num1 = 3223.33;
        Double num2 = 53.33;
        Double modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
        return modulus;
    }

    public Double modulusByParameterAndReturnValue(Double num1, Double num2) {
        Double modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
        return modulus;
    }
}
