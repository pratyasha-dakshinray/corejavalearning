package com.shauryax.sub;

import java.util.Scanner;

public class SubtractDoubleNumberUserInput {
    public static void main (String[] args){
        Scanner sum = new Scanner(System.in);
        System.out.print("Enter the 1st number in Double format = " );
        Double x = sum.nextDouble();
        System.out.print("Enter the 1st number in Double format = " );
        Double y = sum.nextDouble();
        Double z = x - y;
        System.out.println("The subtraction of two Double are = " + z);

    }
}
