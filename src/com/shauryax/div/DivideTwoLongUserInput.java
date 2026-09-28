package com.shauryax.div;

import java.util.Scanner;

public class DivideTwoLongUserInput {
    public static void main(String[] Args){
        Scanner divide = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        Long x = divide.nextLong();
        System.out.print("Enter the second number = ");
        Long y = divide.nextLong();
        Long z = x/y;
        System.out.println("The output is = " + z);
    }
}
