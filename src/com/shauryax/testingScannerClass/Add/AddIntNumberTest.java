package com.shauryax.testingScannerClass.Add;

import com.shauryax.Testing.Add.AddIntegerNumber;
import java.util.Scanner;

public class AddIntNumberTest {
    public static void main(String[] args) {

        AddIntegerNumber addIntegerNumber = new AddIntegerNumber();
        Scanner sc = new Scanner(System.in);

        addIntegerNumber.addition();

        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        addIntegerNumber.additionByParameter(num1, num2);

        int returnValue = addIntegerNumber.additionByReturnValue();
        System.out.println("The addition is " + returnValue);

        int result = addIntegerNumber.additionByParameterAndReturnValue(num1, num2);
        System.out.println("The addition is " + result);

        sc.close();
    }
}