package com.shauryax.sub;

import java.util.Scanner;

public class SubtractTwoFloatUserInput {
    public static void main(String[]Args){
        Scanner subtract = new Scanner(System.in);
        System.out.print("The number x = ");
        float x = subtract.nextFloat();
        System.out.print("The number y = ");
        float y = subtract.nextFloat();
        float z = x - y;
        System.out.println("The output is = " + z);
    }
}
