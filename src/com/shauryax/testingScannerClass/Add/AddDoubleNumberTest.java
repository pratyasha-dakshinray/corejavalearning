package com.shauryax.testingScannerClass.Add;

import com.shauryax.Testing.Add.AddDoubleNumber;
import java.util.Scanner;

public class AddDoubleNumberTest {
    public static void main(String[] args) {
        AddDoubleNumber addDoubleNumber = new AddDoubleNumber();
        Scanner sc = new Scanner(System.in);

        addDoubleNumber.addition();

        System.out.print("Enter the 1st number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the 2nd number: ");
        double num2 = sc.nextDouble();

        addDoubleNumber.additionByParameter(num1, num2);

        double returnValue = addDoubleNumber.additionByReturnValue();
        System.out.println("The addition is " + returnValue);

        double result = addDoubleNumber.additionParameterAndByReturnValue(num1, num2);
        System.out.println("The addition is " + result);

        sc.close();
    }
}