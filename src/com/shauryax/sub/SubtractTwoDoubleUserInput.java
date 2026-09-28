package com.shauryax.sub;

import java.util.Scanner;

public class SubtractTwoDoubleUserInput {
    public static void main(String[]Args){
        Scanner subtract = new Scanner(System.in);
        System.out.print("The number x = ");
        double x = subtract.nextDouble();
        System.out.print("The number y = ");
        double y = subtract.nextDouble();
        double z = x - y;
        System.out.println("The output is = " + z);
    }
}
