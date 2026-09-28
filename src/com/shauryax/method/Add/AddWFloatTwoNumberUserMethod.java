package com.shauryax.method.Add;

public class AddWFloatTwoNumberUserMethod {
    public static void main(String[] args) {
        AddFloatTwoNumberUserMethod add = new AddFloatTwoNumberUserMethod();
        add.addition();
        add.additionByParameter(326.5f,72.45f);
        Float returnValue = add.additionByReturnValue();
        System.out.println("The sum is " + returnValue);
        add.additionByReturnValue();

        Float ParameterReturn = add.additionByParameterAndReturnValue(24.124f,22.352f);
        System.out.println("The sum is " +  ParameterReturn);
    }

    public void addition(){
        Float num1 = 454.31f;
        Float num2 = 2334.4f;
        Float sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public void additionByParameter(Float num1, Float num2){
        Float sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public Float additionByReturnValue(){
        Float num1 = 132.3f;
        Float num2 = 276.34f;
        Float sum = num1 + num2;
        return sum;
    }

    public Float additionByParameterAndReturnValue(Float num1, Float num2){
        Float sum = num1 + num2;
        return sum;
    }
}
