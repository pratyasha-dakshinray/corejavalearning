package com.shauryax.div;

import java.util.Scanner;

public class DivideTwoFloatUserInput {
    public static void main(String[] Args){
        Scanner divide = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        float x = divide.nextFloat();
        System.out.print("Enter the second number = ");
        float y = divide.nextFloat();
        float z = x/y;
        System.out.println("The output is = " + z);
    }
}
