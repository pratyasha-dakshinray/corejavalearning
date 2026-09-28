package com.shauryax.mul;

import java.util.Scanner;

public class MultiplyTwoLongUserInput {
    public static void main(String[]Args){
        Scanner multiply = new Scanner(System.in);
        System.out.print("The number x = ");
        long x = multiply.nextLong();
        System.out.print("The number y = ");
        long y =  multiply.nextLong();
        long z = x * y;
        System.out.println("The output is = " + z);
    }
}
