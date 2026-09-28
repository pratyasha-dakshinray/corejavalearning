package com.shauryax.mul;

import java.util.Scanner;

public class MultiplyTwoIntUserInput {
    public static void main(String[]Args){
        Scanner multiply = new Scanner(System.in);
        System.out.print("The number x = ");
        int x = multiply.nextInt();
        System.out.print("The number y = ");
        int y =  multiply.nextInt();
        int z = x * y;
        System.out.println("The output is = " + z);
    }
}
