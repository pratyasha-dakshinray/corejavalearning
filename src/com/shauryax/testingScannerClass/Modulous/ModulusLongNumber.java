package com.shauryax.testingScannerClass.Modulous;

public class ModulusLongNumber {
    public void modulus(){
        long num1 = 7565656547l;
        long num2 = 757l;
        long modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
    }

    public void modulusByParameter(long num1, long num2){
        long modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
    }

    public long modulusByReturnValue(){
        long num1 = 7565656547l;
        long num2 = 757l;
        long modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
        return modulus;
    }

    public long modulusByParameterAndReturnValue(long num1, long num2){
        long modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
        return modulus;
    }
}
