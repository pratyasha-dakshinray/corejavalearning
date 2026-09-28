package com.shauryax.mul;

import java.util.Scanner;

public class MultiplyTwoFloatUserInput {
    public static void main(String[]Args){
        Scanner multiply = new Scanner(System.in);
        System.out.print("The number x = ");
        float x = multiply.nextFloat();
        System.out.print("The number y = ");
        float y =  multiply.nextFloat();
        float z = x * y;
        System.out.println("The output is = " + z);
    }
}
