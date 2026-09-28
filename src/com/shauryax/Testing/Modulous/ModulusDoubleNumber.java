package com.shauryax.Testing.Modulous;

public class ModulusDoubleNumber {
    public void modulous(){
        double num1 = 243.34;
        double num2 = 34.34;
        double Division = num1 / num2;
        System.out.println("The division of two numbers are = "+ Division);
    }

    public double modulousByReturnValue(){
        double num1 = 243.34;
        double num2 = 34.34;
        double Division = num1 / num2;
        System.out.println("The division of two numbers are = "+ Division);
        return Division;
    }

    public void modulousByParameter(double num1, double num2){
        double Division = num1 / num2;
        System.out.println("The division of two numbers are = "+ Division);

    }

    public double modulousByParameterAndReturnValue(double num1, double num2){
        double Division = num1 / num2;
        System.out.println("The division of two numbers are = "+ Division);
        return Division;
    }
}
