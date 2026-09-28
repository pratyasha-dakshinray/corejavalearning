package com.shauryax.method.Add;

public class AddWLongTwoNumberUserMethod {
    public static void main(String[] args) {
        AddLongTwoNumberUserMethod add = new AddLongTwoNumberUserMethod();
        add.addition();
        add.additionByParameter(623454524l,72233457l);
        Long returnValue = add.additionByReturnValue();
        System.out.println("The sum is " + returnValue);
        add.additionByReturnValue();

        Long ParameterReturn = add.additionByParameterAndReturnValue(2413424l,2352354565l);
        System.out.println("The sum is " +  ParameterReturn);
    }

    public void addition(){
        Long num1 = 134657l;
        Long num2 = 234356l;
        Long sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public void additionByParameter(Long num1, Long num2){
        Long sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public Long additionByReturnValue(){
        Long num1 = 13254657l;
        Long num2 = 246567567l;
        Long sum = num1 + num2;
        return sum;
    }

    public Long additionByParameterAndReturnValue(Long num1, Long num2){
        Long sum = num1 + num2;
        return sum;
    }
}
