package com.shauryax.method.Add;

public class AddDoubleTwoNumberUserMethod {
    public static void main(String[] args) {
        AddDoubleTwoNumberUserMethod add = new AddDoubleTwoNumberUserMethod();
        add.addition();
        add.additionByParameter(6.5,7.45);
        double returnValue = add.additionByReturnValue();
        System.out.println("The sum is " + returnValue);
        add.additionByReturnValue();

        double ParameterReturn = add.additionByParameterAndReturnValue(24.124,2.352);
        System.out.println("The sum is " +  ParameterReturn);
    }

    public void addition(){
        double num1 = 44.31;
        double num2 = 234.4;
        double sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public void additionByParameter(double num1, double num2){
        double sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public double additionByReturnValue(){
        double num1 = 12.3;
        double num2 = 2.34;
        double sum = num1 + num2;
        return sum;
    }

    public double additionByParameterAndReturnValue(double num1, double num2){
        double sum = num1 + num2;
        return sum;
    }
}
