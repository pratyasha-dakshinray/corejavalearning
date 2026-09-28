package com.shauryax.add;

import java.util.Scanner;

public class AddTwoDoubleUserInput {
    public static void main (String[] args){
        Scanner sum = new Scanner(System.in);
        System.out.print("First num x is - " );
        double x = sum.nextDouble();
        System.out.print("Second num y is - " );
        double y = sum.nextDouble();
        double z = x+y;
        System.out.print("The sum is - " + z);
    }
}
