package com.shauryax.method.Mod;

public class ModDoubleTwoNumberUserMethod {
    public static void main(String[] args) {
        ModDoubleTwoNumberUserMethod Mod = new ModDoubleTwoNumberUserMethod();
        Mod.Modulus();
        Mod.ModulusByParameter(837.65, 24.5);
        double returnValue = Mod.ModulusByReturnValue();
        System.out.println("The modulus is " + returnValue);
        Mod.ModulusByReturnValue();

        double ParameterReturn = Mod.ModulusByParameterAndReturnValue(456.78, 31.2);
        System.out.println("The modulus is " + ParameterReturn);
    }

    public void Modulus(){
        double num1 = 47.86;
        double num2 = 6.3;
        double modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public void ModulusByParameter(double num1, double num2){
        double modulus = num1 % num2;
        System.out.println("modulus= " + modulus);
    }

    public double ModulusByReturnValue(){
        double num1 = 89.64;
        double num2 = 7.4;
        double modulus = num1 % num2;
        return modulus;
    }

    public double ModulusByParameterAndReturnValue(double num1, double num2){
        double modulus = num1 % num2;
        return modulus;
    }
}
