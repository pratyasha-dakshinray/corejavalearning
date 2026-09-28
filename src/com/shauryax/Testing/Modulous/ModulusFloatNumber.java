package com.shauryax.Testing.Modulous;

public class ModulusFloatNumber {
    public void modulous(){
        float num1 = 423.4f;
        float num2 = 34.56f;
        float mod = num1 % num2;
        System.out.println("The modulous of two numbers are = "+ mod);
    }

    public void modulousByParameter(float num1, float num2){
        float mod =  num1 % num2;
        System.out.println("The modulous of two numbers are = "+ mod);
    }

    public float modulousByReturnValue(){
        float num1 = 42.4f;
        float num2 = 34.56f;
        float mod = num1 % num2;
        System.out.println("The modulous of two numbers are = "+ mod);
        return mod;
    }

    public float modulousByParameterAndReturnValue(float num1, float num2){
        float mod =  num1 % num2;
        System.out.println("The modulous of two numbers are = "+ mod);
        return mod;
    }
}
