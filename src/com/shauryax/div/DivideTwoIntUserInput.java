package com.shauryax.div;

import java.util.Scanner;

public class DivideTwoIntUserInput {
    public static void main(String[] Args){
        Scanner divide = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int x = divide.nextInt();
        System.out.print("Enter the second number = ");
        int y = divide.nextInt();
        int z = x/y;
        System.out.println("The output is = " + z);
    }
}
