package com.shauryax.testingScannerClass.Add;

import com.shauryax.Testing.Add.AddLongNumber;
import java.util.Scanner;

public class AddLongNumberTest {
    public static void main(String[] args) {

        AddLongNumber addLongNumber = new AddLongNumber();
        Scanner sc = new Scanner(System.in);

        addLongNumber.addition();

        System.out.print("Enter the 1st number: ");
        long num1 = sc.nextLong();

        System.out.print("Enter the 2nd number: ");
        long num2 = sc.nextLong();

        addLongNumber.additionByParameter(num1, num2);

        long returnValue = addLongNumber.additionByReturnValue();
        System.out.println("The addition is " + returnValue);

        long result = addLongNumber.additionByParameterAndReturnValue(num1, num2);
        System.out.println("The addition is " + result);

        sc.close();
    }
}