package com.shauryax.mod;

import java.util.Scanner;

public class ModOfTwoIntUserInput {
    public static void main (String[] Args){
        Scanner modulous = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int x = modulous.nextInt();
        System.out.print("Enter the second number = ");
        int y = modulous.nextInt();
        int z = x % y;
        System.out.println("The modulous of two numbers is = " + z);

    }
}
