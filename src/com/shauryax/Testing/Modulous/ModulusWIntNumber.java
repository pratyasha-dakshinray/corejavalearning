package com.shauryax.Testing.Modulous;

public class ModulusWIntNumber {

    public void modulus(){
        Integer num1 = 10;
        Integer num2 = 20;
        Integer modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
    }

    public Integer modulusByReturnValue(){
        Integer num1 = 10;
        Integer num2 = 20;
        Integer modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
        return modulus;
    }

    public void modulusByParameter(Integer num1, Integer num2){
        Integer modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
    }

    public Integer modulusByParameterAndReturnValue(Integer num1, Integer num2){
        Integer modulus = num1 % num2;
        System.out.println("modulus = " + modulus);
        return modulus;
    }
}
