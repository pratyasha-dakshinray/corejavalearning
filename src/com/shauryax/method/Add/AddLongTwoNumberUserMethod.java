package com.shauryax.method.Add;

public class AddLongTwoNumberUserMethod {
    public static void main(String[] args) {
        AddIntTwoNumberUserMethod add = new AddIntTwoNumberUserMethod();
        add.addition();
        add.additionByParameter(623455,721344);
        long returnValue = add.additionByReturnValue();
        System.out.println("The sum is " + returnValue);
        add.additionByReturnValue();

        long ParameterReturn = add.additionByParameterAndReturnValue(2412324,234254352);
        System.out.println("The sum is " +  ParameterReturn);
    }

    public void addition(){
        long num1 = 1213456;
        long num2 = 235462;
        long sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public void additionByParameter(long num1, long num2){
        long sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public long additionByReturnValue(){
        long num1 = 112345;
        long num2 = 345672;
        long sum = num1 + num2;
        return sum;
    }

    public long additionByParameterAndReturnValue(long num1, long num2){
        long sum = num1 + num2;
        return sum;
    }

}
