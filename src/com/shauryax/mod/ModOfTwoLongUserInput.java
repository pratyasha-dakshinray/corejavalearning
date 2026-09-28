package com.shauryax.mod;

import java.util.Scanner;

public class ModOfTwoLongUserInput {
    public static void main(String[] Args){
        Scanner modulous = new Scanner(System.in);
        System.out.print ("Enter the first number = ");
        long x = modulous.nextLong();
        System.out.print("Enter the second number = ");
        long y = modulous.nextLong();
        long z = x % y;
        Integer p = 10;

        System.out.println("The modulous of two numbers is = " + z);
    }
}
