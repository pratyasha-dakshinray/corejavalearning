package com.shauryax.sub;

import java.util.Scanner;

public class SubtractLongNumberUserInput {
    public static void main (String[] args){
        Scanner sum = new Scanner(System.in);
        System.out.print("Enter the 1st number in Long format = " );
        Long  x = sum.nextLong();
        System.out.print("Enter the 1st number in Long format = " );
        Long y = sum.nextLong();
        Long z = x - y;
        System.out.println("The subtraction of two Long are = " + z);
    }
}
