
package com;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        /* Question 1 : In a program, input 3 numbers: A, B andC. You have to output the average of
these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N) */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("The first number you want to enter = ");
//        int num1 = sc.nextInt();
//        System.out.println("The second number you want to enter = ");
//        int num2 = sc.nextInt();
//        System.out.println("The third number you want to enter = ");
//        int num3 = sc.nextInt();
//
//        int avg = (num1 + num2 + num3) / 3;
//
//        System.out.println("The average of all numbers is " + avg);

 /* Question 2: In a program, input the side of a square. You have to output the area of the
square.
(Hint : area of a square is (side x side)) */

//        Scanner sc = new Scanner(System.in);
//        System.out.print("The side of the square is = ");
//        int side = sc.nextInt();
//        int areaOfTheSquare = side * side;
//        System.out.print("The area of the square is = " + areaOfTheSquare);

/* Question 3: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the cost of the first item = ");
//        float cost1 = input.nextInt();
//        System.out.println("Enter the cost of the second item = ");
//        float cost2 = input.nextInt();
//        System.out.println("Enter the cost of the third item = ");
//        float cost3 = input.nextInt();
//
//        float bill = cost1 + cost2 + cost3;
//        float taxBill = ((cost1 + cost2 + cost3) * 18 / 100) + bill;
//
//        System.out.println("The bill amount without tax is " + bill + " and the bill added with tax is " + taxBill);

//q.4
//        byte b = 4;
//        char c = 'a';
//        short s = 512;
//        int i = 1000;
//        float f = 3.14f;
//        double d = 99.9954;
//        double result = (f * b) + (i % c) - (d * s);
//        System.out.println(result);

/* Question1: Write a Java program to get a number from the user and print whether it is
positive or negative. */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number you want to check = ");
//        int n = sc.nextInt();
//
//        if (n >= 0){
//            System.out.println("The number you entered is +ve ");
//        }
//        else{
//            System.out.println("The number you entered is negative ");
//        }
/* Question2: Finish the following code so that it prints you have a fever if your temperature
is above 100 and otherwise prints You don't have a fever. */
//        double temp = 103.3d;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the temperature in Fahrenheit - ");
//        double Fahrenheit = input.nextDouble();
//        if (Fahrenheit >= temp) {
//            System.out.println("You have fever");
//        }
//        else{
//            System.out.println("You do not have fever");
//        }
/*Question3: Write a Java program to input week number(1-7) and print day of week name
        using switch case.*/
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of the day in the week = ");
//        int week =  input.nextInt();
//
//        switch (week) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Please enter the number of the day in the week in between 1 and 7 = ");
//        }

/*  6.*/
//        int a = 63, b = 36;
//        boolean x = (a < b ) ? true : false;
//        int y= (a > b ) ? a : b;
//        System.out.println(x);
//        System.out.println(y);

/* Question5: Write a Java program that takes a year from the user and print whether that
year is a leap year or not. */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number for year = ");
//        int year =  input.nextInt();
//
//        boolean x = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 100 != 0);
//        if(x == true){
//            System.out.println("The year is a leap year");
//        }
//        else{
//            System.out.println("The year is not a leap year");
//        }

/* Question4: Write a program to print the multiplication table of a number N,entered by the
user. */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number you want the multiplication table ");
//        int N = input.nextInt();
//        for(int i = 1; i <= 10; i++) {
//            System.out.println("The multiplication table is = " + N*i );
//        }
/* Question 1 : Write a Java method to compute the average of three numbers. */

//           Scanner input = new Scanner(System.in);
//           System.out.print("Enter number: ");
//           double num1 = input.nextInt();
//           System.out.print("Enter number: ");
//           double num2 = input.nextInt();
//           System.out.println("Enter number: ");
//           double num3 = input.nextInt();
//
//           double avg = (num1 + num2 + num3) / 3 ;
//           System.out.println("Average is: " + avg);
//

// Printing  1 to 100 all the even and odd numbers and 19 th table

//        for(int i = 19 ; i <= 190 ; i ++){
//            if(i % 19 == 0){
//                System.out.println(i);
//            }


//Q. display this ap = 1,3,5,7,9........ upto 'n' terms
        /*
        a, a + d, a + 2d, a + 3d, .......... a + (n-1)d
        so an = a +(n - 1)d
        ~ an = 1 + (n - 1)2
        ~ an = 1 + 2n - 2
        ~ an = 2n - 1
        *3 - 1 = 2 ; 5 - 3 = 2; 9 - 7 = 2;
        * so d = 2
        * a = 1
        * nth term =
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = sc.nextInt();
        int an = 2 * n - 1 ;
        System.out.println(an);









        }

    }









