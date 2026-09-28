package com.shauryax.Testing.Modulous;

public class ModulusWLongNumber {

    public void modulus(){
        Long num1 = 1234545l;
        Long num2 = 989l;
        Long modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
    }
    public Long modulusByReturnValue(){
        Long num1 = 1234545l;
        Long num2 = 989l;
        Long modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
        return modulus;
    }

    public Long modulusByParameterAndReturnValue(Long num1, Long num2){
        Long modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
        return modulus;
    }

    public void modulusByParameter(Long num1, Long num2){
        Long modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
    }
}
