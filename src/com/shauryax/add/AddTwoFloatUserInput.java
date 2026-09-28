package com.shauryax.add;

import java.util.Scanner;

public class AddTwoFloatUserInput {
    public static void main (String[] args){
        Scanner add = new Scanner(System.in);
        System.out.println("Enter the number x - ");
        float x = add.nextFloat();
        System.out.println("Enter the number y - ");
        float y = add.nextFloat();
        float z = x + y;
        System.out.println("The sum is = " + z) ;

    }
}
