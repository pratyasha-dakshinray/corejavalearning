package com.shauryax.method.Mod;

public class ModWLongTwoNumberUserMethod {
    public static void main(String[] args) {
        ModWLongTwoNumberUserMethod Mod = new ModWLongTwoNumberUserMethod();
        Mod.Modulus();
        Mod.ModulusByParameter(837654L, 245L);
        Long returnValue = Mod.ModulusByReturnValue();
        System.out.println("The modulus is " + returnValue);
        Mod.ModulusByReturnValue();

        Long ParameterReturn = Mod.ModulusByParameterAndReturnValue(456789L, 312L);
        System.out.println("The modulus is " + ParameterReturn);
    }

    public void Modulus(){
        Long num1 = 47865L;
        Long num2 = 630L;
        Long modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public void ModulusByParameter(Long num1, Long num2){
        Long modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public Long ModulusByReturnValue(){
        Long num1 = 89643L;
        Long num2 = 740L;
        Long modulus = num1 % num2;
        return modulus;
    }

    public Long ModulusByParameterAndReturnValue(Long num1, Long num2){
        Long modulus = num1 % num2;
        return modulus;
    }
}
