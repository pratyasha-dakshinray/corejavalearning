package com.shauryax.method.Mod;

public class ModWIntTwoNumberUserMethod {
    public static void main(String[] args) {
        ModWIntTwoNumberUserMethod Mod = new ModWIntTwoNumberUserMethod();
        Mod.Modulus();
        Mod.ModulusByParameter(8376, 245);
        Integer returnValue = Mod.ModulusByReturnValue();
        System.out.println("The modulus is " + returnValue);
        Mod.ModulusByReturnValue();

        Integer ParameterReturn = Mod.ModulusByParameterAndReturnValue(4567, 312);
        System.out.println("The modulus is " + ParameterReturn);
    }

    public void Modulus(){
        Integer num1 = 4786;
        Integer num2 = 63;
        Integer modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public void ModulusByParameter(Integer num1, Integer num2){
        Integer modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public Integer ModulusByReturnValue(){
        Integer num1 = 8964;
        Integer num2 = 74;
        Integer modulus = num1 % num2;
        return modulus;
    }

    public Integer ModulusByParameterAndReturnValue(Integer num1, Integer num2){
        Integer modulus = num1 % num2;
        return modulus;
    }
}
