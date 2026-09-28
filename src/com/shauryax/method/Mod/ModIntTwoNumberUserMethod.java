package com.shauryax.method.Mod;

import com.shauryax.method.Add.AddIntTwoNumberUserMethod;

public class ModIntTwoNumberUserMethod {
    public static void main(String[] args) {
        ModIntTwoNumberUserMethod Mod = new ModIntTwoNumberUserMethod();
        Mod.Modulus();
        Mod.ModulusByParameter(8376, 245);
        int returnValue = Mod.ModulusByReturnValue();
        System.out.println("The modulus is " + returnValue);
        Mod.ModulusByReturnValue();

        int ParameterReturn = Mod.ModulusByParameterAndReturnValue(4567, 312);
        System.out.println("The modulus is " + ParameterReturn);
    }

    public void Modulus(){
        int num1 = 4786;
        int num2 = 63;
        int modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public void ModulusByParameter(int num1, int num2){
        int modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public int ModulusByReturnValue(){
        int num1 = 8964;
        int num2 = 74;
        int modulus = num1 % num2;
        return modulus;
    }

    public int ModulusByParameterAndReturnValue(int num1, int num2){
        int modulus = num1 % num2;
        return modulus;
    }
}
