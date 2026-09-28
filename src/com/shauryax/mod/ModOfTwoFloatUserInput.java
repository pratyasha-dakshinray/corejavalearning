package com.shauryax.mod;

import java.util.Scanner;

public class ModOfTwoFloatUserInput {
    public static void main (String[] Args){
        Scanner modulous = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        float x = modulous.nextFloat();
        System.out.print("Enter the second number = ");
        float y = modulous.nextFloat();
        float z = x % y;
        System.out.println("The modulous of two numbers is = " + z);
    }
}
