package com.shauryax.div;

import java.util.Scanner;

public class DivisionFloatNumberUserInput {
    public static void main (String[] args){
        Scanner sum = new Scanner(System.in);
        System.out.print("Enter the 1st number in Float format = " );
        Float x = sum.nextFloat();
        System.out.print("Enter the 1st number in Float format = " );
        Float y = sum.nextFloat();
        Float z = x / y;
        System.out.println("The division of two Float are = " + z);

    }
}
