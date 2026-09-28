package com.shauryax.sub;

import java.util.Scanner;

public class SubtractTwoLongUserInput {
    public static void main(String[]Args){
        Scanner subtract = new Scanner(System.in);
        System.out.print("The number x = ");
        long x = subtract.nextLong();
        System.out.print("The number y = ");
        long y = subtract.nextLong();
        long z = x - y;
        System.out.println("The output is = " + z);
    }
}
