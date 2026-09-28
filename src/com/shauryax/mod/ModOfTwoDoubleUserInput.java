package com.shauryax.mod;

import java.util.Scanner;

public class ModOfTwoDoubleUserInput {
    public static void main(String[] Args){
        Scanner modulous = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        double x = modulous.nextDouble();
        System.out.print("Enter the second number = ");
        double y = modulous.nextDouble();
        double z = x % y;
        System.out.println("The modulous of two numbers is = " + z);
    }
}
