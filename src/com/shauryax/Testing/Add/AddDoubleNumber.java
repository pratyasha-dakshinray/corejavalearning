package com.shauryax.Testing.Add;

import java.util.Scanner;

public class AddDoubleNumber {

    public void addition(){
        double num1 = 324.33;
        double num2 = 3434.34;
        double sum = num1 + num2;
        System.out.println("The sum is = "+sum);
    }

    public void additionByParameter(double num1, double num2){



        double sum = num1 + num2;

        System.out.println("The sum is = "+sum);
    }

    public double additionByReturnValue(){
        double num1 = 3445.32;
        double num2 = 3244.325;
        double sum = num1 + num2;

        return sum;
    }

    public double additionParameterAndByReturnValue(double num1, double num2){
        double sum = num1 + num2;

        return sum;
    }


}
