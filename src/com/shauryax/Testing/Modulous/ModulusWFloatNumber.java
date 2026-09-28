package com.shauryax.Testing.Modulous;

public class ModulusWFloatNumber {

    public void modulus(){
        Float num1 = 2323.33f;
        Float num2 = 23.33f;
        Float modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
    }

    public void modulusByParameter(Float num1, Float num2){
        Float modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
    }

    public Float modulusByReturnValue(){
        Float num1 = 2323.33f;
        Float num2 = 23.33f;
        Float modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
        return modulus;
    }

    public Float modulusByParameterAndReturnValue(Float num1, Float num2){
        Float modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
        return modulus;
    }
}
