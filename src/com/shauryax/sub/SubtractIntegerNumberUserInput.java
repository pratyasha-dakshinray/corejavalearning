package com.shauryax.sub;

import java.util.Scanner;

public class SubtractIntegerNumberUserInput {
    public static void main (String[] args){
        Scanner sum = new Scanner(System.in);
        System.out.print("Enter the 1st number in integer format = " );
        Integer x = sum.nextInt();
        System.out.print("Enter the 1st number in integer format = " );
        Integer y = sum.nextInt();
        Integer z = x - y;
        System.out.println("The subtraction of two integers are = " + z);

    }
}
