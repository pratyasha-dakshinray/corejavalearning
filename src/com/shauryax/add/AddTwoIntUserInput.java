package com.shauryax.add;

import java.util.Scanner;

public class AddTwoIntUserInput {
    public static void main(String[] args) {

        Scanner Summation = new Scanner(System.in);

        System.out.print("Enter the 1st number - ");
        int num1 = Summation.nextInt();

        System.out.print("Enter the 2nd number - ");
        int num2 = Summation.nextInt();

        int sum = num1 + num2;

        System.out.println ("The sum = " + sum);


    }
}
