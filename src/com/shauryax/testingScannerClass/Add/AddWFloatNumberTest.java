package com.shauryax.testingScannerClass.Add;

import com.shauryax.Testing.Add.AddWFloatNumber;
import java.util.Scanner;

public class AddWFloatNumberTest {
    public static void main(String[] args) {
        AddWFloatNumber addWFloatNumber = new AddWFloatNumber();
        Scanner sc = new Scanner(System.in);

        addWFloatNumber.addition();

        System.out.print("Enter the 1st number: ");
        Float num1 = sc.nextFloat();

        System.out.print("Enter the 2nd number: ");
        Float num2 = sc.nextFloat();

        addWFloatNumber.additionByParameter(num1, num2);

        Float returnValue = addWFloatNumber.additionByReturnValue();
        System.out.println("The addition is " + returnValue);

        Float result = addWFloatNumber.additionByParameterAndReturnValue(num1, num2);
        System.out.println("The addition is " + result);

        sc.close();
    }
}
