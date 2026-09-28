package com.shauryax.method.Add;

public class AddIntTwoNumberUserMethod {
    public static void main(String[] args) {
        AddIntTwoNumberUserMethod add = new AddIntTwoNumberUserMethod();
        add.addition();
        add.additionByParameter(6,7);
        int returnValue = add.additionByReturnValue();
        System.out.println("The sum is " + returnValue);
        add.additionByReturnValue();

        int ParameterReturn = add.additionByParameterAndReturnValue(24124,2352);
        System.out.println("The sum is " +  ParameterReturn);
    }

    public void addition(){
        int num1 = 1;
        int num2 = 2;
        int sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public void additionByParameter(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public int additionByReturnValue(){
        int num1 = 1;
        int num2 = 2;
        int sum = num1 + num2;
        return sum;
    }

    public int additionByParameterAndReturnValue(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}
