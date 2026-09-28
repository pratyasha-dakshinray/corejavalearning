package com.shauryax.div;

import java.util.Scanner;

public class DivideTwoDoubleUserInput {
    public static void main(String[] Args){
        Scanner divide = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        double x = divide.nextDouble();
        System.out.print("Enter the second number = ");
        double y = divide.nextDouble();
        double z = x/y;
        System.out.println("The output is = " + z);
    }


}
