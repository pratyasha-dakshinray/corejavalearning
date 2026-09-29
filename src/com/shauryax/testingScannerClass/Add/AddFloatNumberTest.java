package com.shauryax.testingScannerClass.Add;

import com.shauryax.Testing.Add.AddFloatNumber;
import java.util.Scanner;

public class AddFloatNumberTest {
    public static void main(String[] args) {

        AddFloatNumber addFloatNumber = new AddFloatNumber();
        Scanner sc = new Scanner(System.in);

        addFloatNumber.addition();

        System.out.print("Enter the 1st number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter the 2nd number: ");
        float num2 = sc.nextFloat();

        addFloatNumber.additionByParameter(num1, num2);

        float returnValue = addFloatNumber.additionByReturnValue();
        System.out.println("The addition is " + returnValue);

        float result = addFloatNumber.additionByParameterAndReturnValue(num1, num2);
        System.out.println("The addition is " + result);

        sc.close();
    }
}