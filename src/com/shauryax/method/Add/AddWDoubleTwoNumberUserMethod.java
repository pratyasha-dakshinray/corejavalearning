package com.shauryax.method.Add;

public class AddWDoubleTwoNumberUserMethod {
    public static void main(String[] args) {
        AddDoubleTwoNumberUserMethod add = new AddDoubleTwoNumberUserMethod();
        add.addition();
        add.additionByParameter(3426.355,72334.4345);
        Double returnValue = add.additionByReturnValue();
        System.out.println("The sum is " + returnValue);
        add.additionByReturnValue();

        Double ParameterReturn = add.additionByParameterAndReturnValue(2423.1324,23342.2352);
        System.out.println("The sum is " +  ParameterReturn);
    }

    public void addition(){
        Double num1 = 4424.3134;
        Double num2 = 232434.4455;
        Double sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public void additionByParameter(Double num1, Double num2){
        Double sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    public Double additionByReturnValue(){
        Double num1 = 132432.32343;
        Double num2 = 2234345.2434;
        Double sum = num1 + num2;
        return sum;
    }

    public Double additionByParameterAndReturnValue(Double num1, Double num2){
        Double sum = num1 + num2;
        return sum;
    }
}
