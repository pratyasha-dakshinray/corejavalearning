package com.shauryax.method.Mod;

public class ModFloatTwoNumberUserMethod {
    public static void main(String[] args) {
        ModFloatTwoNumberUserMethod Mod = new ModFloatTwoNumberUserMethod();
        Mod.Modulus();
        Mod.ModulusByParameter(837.6f, 24.5f);
        float returnValue = Mod.ModulusByReturnValue();
        System.out.println("The modulus is " + returnValue);
        Mod.ModulusByReturnValue();

        float ParameterReturn = Mod.ModulusByParameterAndReturnValue(456.7f, 31.2f);
        System.out.println("The modulus is " + ParameterReturn);
    }

    public void Modulus(){
        float num1 = 47.8f;
        float num2 = 6.3f;
        float modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public void ModulusByParameter(float num1, float num2){
        float modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public float ModulusByReturnValue(){
        float num1 = 89.6f;
        float num2 = 7.4f;
        float modulus = num1 % num2;
        return modulus;
    }

    public float ModulusByParameterAndReturnValue(float num1, float num2){
        float modulus = num1 % num2;
        return modulus;
    }
}
