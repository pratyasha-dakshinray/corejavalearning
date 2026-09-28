package com.shauryax.testingScannerClass.Add;

import com.shauryax.Testing.Add.AddIntegerNumber;

import java.util.Scanner;

public class AddIntNumbersTest {
    public static void main(String[] args){
        AddIntegerNumber addIntegerNumber  = new AddIntegerNumber();
        addIntegerNumber.addition();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer = ");
        int num1 =  sc.nextInt();
        System.out.println("Enter the other integer = ");
        int num2 =  sc.nextInt();

        addIntegerNumber.additionByParameter(num1, num2);

        int value1 = addIntegerNumber.additionByReturnValue();
        System.out.println("The sum isn = " + value1);

        int value2 = addIntegerNumber.additionByParameterAndReturnValue(num1, num2);
        System.out.println("The sum isn = " + value2);

    }
}
