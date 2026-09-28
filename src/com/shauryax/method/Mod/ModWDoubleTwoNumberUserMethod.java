package com.shauryax.method.Mod;

public class ModWDoubleTwoNumberUserMethod {
    public static void main(String[] args) {
        ModWDoubleTwoNumberUserMethod Mod = new ModWDoubleTwoNumberUserMethod();
        Mod.Modulus();
        Mod.ModulusByParameter(837.65, 24.5);
        double returnValue = Mod.ModulusByReturnValue();
        System.out.println("The modulus is " + returnValue);
        Mod.ModulusByReturnValue();

        double ParameterReturn = Mod.ModulusByParameterAndReturnValue(456.78, 31.2);
        System.out.println("The modulus is " + ParameterReturn);
    }

    public void Modulus(){
        Double num1 = 47.86;
        Double num2 = 6.3;
        Double modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public void ModulusByParameter(Double num1, Double num2){
        Double modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public Double ModulusByReturnValue(){
        Double num1 = 89.64;
        Double num2 = 7.4;
        Double modulus = num1 % num2;
        return modulus;
    }

    public Double ModulusByParameterAndReturnValue(Double num1, Double num2){
        Double modulus = num1 % num2;
        return modulus;
    }
}
