package com.shauryax.sub;

import java.util.Scanner;

public class SubtractTwoIntUserInput {
    public static void main(String[]Args){
        Scanner subtract = new Scanner(System.in);
        System.out.print("The number x = ");
        int x = subtract.nextInt();
        System.out.print("The number y = ");
        int y = subtract.nextInt();
        int z = x - y;
        System.out.println("The output is = " + z);
    }
}
