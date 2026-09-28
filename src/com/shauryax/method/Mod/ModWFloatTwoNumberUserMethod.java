package com.shauryax.method.Mod;

public class ModWFloatTwoNumberUserMethod {
    public static void main(String[] args) {
        ModWFloatTwoNumberUserMethod Mod = new ModWFloatTwoNumberUserMethod();
        Mod.Modulus();
        Mod.ModulusByParameter(837.6f, 24.5f);
        Float returnValue = Mod.ModulusByReturnValue();
        System.out.println("The modulus is " + returnValue);
        Mod.ModulusByReturnValue();

        Float ParameterReturn = Mod.ModulusByParameterAndReturnValue(456.7f, 31.2f);
        System.out.println("The modulus is " + ParameterReturn);
    }

    public void Modulus(){
        Float num1 = 47.8f;
        Float num2 = 6.3f;
        Float modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public void ModulusByParameter(Float num1, Float num2){
        Float modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public Float ModulusByReturnValue(){
        Float num1 = 89.6f;
        Float num2 = 7.4f;
        Float modulus = num1 % num2;
        return modulus;
    }

    public Float ModulusByParameterAndReturnValue(Float num1, Float num2){
        Float modulus = num1 % num2;
        return modulus;
    }
}
