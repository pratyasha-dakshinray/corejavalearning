package com.shauryax.add;

import java.util.Scanner;

public class SumLongNumberUserInput {
    public static void main (String[] args){
        Scanner sum = new Scanner(System.in);
        System.out.print("Enter the 1st number in Long format = " );
        Long  x = sum.nextLong();
        System.out.print("Enter the 1st number in Long format = " );
        Long y = sum.nextLong();
        Long z = x + y;
        System.out.println("The sum of two Long are = " + z);
    }
}
