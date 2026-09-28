package com.shauryax.add;

import java.util.Scanner;

public class AddTwoLongUserInput {

        public static void main(String[] args) {

            Scanner Summation = new Scanner(System.in);

            System.out.print("Enter the 1st number - ");
            long num1 = Summation.nextLong();

            System.out.print("Enter the 2nd number - ");
            long num2 = Summation.nextLong();

            long sum = num1 + num2;

            System.out.println ("The sum = " + sum);


        }
}
