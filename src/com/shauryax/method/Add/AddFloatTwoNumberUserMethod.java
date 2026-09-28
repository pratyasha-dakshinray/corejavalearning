package com.shauryax.method.Add;

public class AddFloatTwoNumberUserMethod {
    public static void main(String[] args) {
        AddFloatTwoNumberUserMethod add = new AddFloatTwoNumberUserMethod();
        add.addition();
        add.additionByParameter(6.5f,7.45f);
        float returnValue = add.additionByReturnValue();
        System.out.println("The sum is " + returnValue);
        add.additionByReturnValue();

        float ParameterReturn = add.additionByParameterAndReturnValue(24.124f,2.352f);
        System.out.println("The sum is " +  ParameterReturn);
    }

    public void addition(){
        float num1 = 44.31f;
        float num2 = 234.4f;
        float sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public void additionByParameter(float num1, float num2){
        float sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public float additionByReturnValue(){
        float num1 = 12.3f;
        float num2 = 2.34f;
        float sum = num1 + num2;
        return sum;
    }

    public float additionByParameterAndReturnValue(float num1, float num2){
        float sum = num1 + num2;
        return sum;
    }
}
