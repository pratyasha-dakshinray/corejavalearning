package com.shauryax.method.Add;

public class AddWIntTwoNumberUserMethod {
    public static void main(String[] args) {
        AddIntTwoNumberUserMethod add = new AddIntTwoNumberUserMethod();
        add.addition();
        add.additionByParameter(6,7);
        Integer returnValue = add.additionByReturnValue();
        System.out.println("The sum is " + returnValue);
        add.additionByReturnValue();

        Integer ParameterReturn = add.additionByParameterAndReturnValue(24124,2352);
        System.out.println("The sum is " +  ParameterReturn);
    }

    public void addition(){
        Integer num1 = 1;
        Integer num2 = 2;
        Integer sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public void additionByParameter(Integer num1, Integer num2){
        Integer sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public Integer additionByReturnValue(){
        Integer num1 = 1;
        Integer num2 = 2;
        Integer sum = num1 + num2;
        return sum;
    }

    public Integer additionByParameterAndReturnValue(Integer num1, Integer num2){
        Integer sum = num1 + num2;
        return sum;
    }
}
