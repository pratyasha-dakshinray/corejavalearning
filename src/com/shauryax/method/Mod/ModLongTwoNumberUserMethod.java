package com.shauryax.method.Mod;

public class ModLongTwoNumberUserMethod {
    public static void main(String[] args) {
        ModLongTwoNumberUserMethod Mod = new ModLongTwoNumberUserMethod();
        Mod.Modulus();
        Mod.ModulusByParameter(837654L, 245L);
        long returnValue = Mod.ModulusByReturnValue();
        System.out.println("The modulus is " + returnValue);
        Mod.ModulusByReturnValue();

        long ParameterReturn = Mod.ModulusByParameterAndReturnValue(456789L, 312L);
        System.out.println("The modulus is " + ParameterReturn);
    }

    public void Modulus(){
        long num1 = 47865L;
        long num2 = 630L;
        long modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public void ModulusByParameter(long num1, long num2){
        long modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public long ModulusByReturnValue(){
        long num1 = 89643L;
        long num2 = 740L;
        long modulus = num1 % num2;
        return modulus;
    }

    public long ModulusByParameterAndReturnValue(long num1, long num2){
        long modulus = num1 % num2;
        return modulus;
    }
}
