package com.shauryax.Testing.Modulous;

public class ModulusIntegerNumber {
    public void modulus(){
        int num1 = 344;
        int num2 = 4;
        int modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
    }

    public void modulusByParameter(int num1, int num2){
        int modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
    }

    public int modulusByParameterAndReturnValue(int num1, int num2){
        int modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
        return modulus;
    }

    public int modulusByReturnValue(){
        int num1 = 561;
        int num2 = 4;
        int modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
        return modulus;
    }
}
