package com.shauryax.mul;

import java.util.Scanner;

public class MultiplyTwoDoubleUserInput {
    public static void main(String[]Args){
        Scanner multiply = new Scanner(System.in);
        System.out.print("The number x = ");
        double x = multiply.nextDouble();
        System.out.print("The number y = ");
        double y =  multiply.nextDouble();
        double z = x * y;
        System.out.println("The output is = " + z);
    }
}
