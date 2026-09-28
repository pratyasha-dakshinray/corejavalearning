package com.shauryax.method.Division;

public class DivideWDoubleTwoNumberUserMethod {
    public static void main(String[] args) {
        DivideWDoubleTwoNumberUserMethod Divide = new DivideWDoubleTwoNumberUserMethod();
        Divide.Division();
        Divide.DivisionByParameter(623.3,7.2);
        double returnValue = Divide.DivisionByReturnValue();
        System.out.println("The division is " + returnValue);
        Divide.DivisionByReturnValue();

        Double ParameterReturn = Divide.DivisionByParameterAndReturnValue(241.24,2.3);
        System.out.println("The division is " +  ParameterReturn);
    }

    public void Division(){
        Double num1 = 14.5;
        Double num2 = 2.5;
        Double division= num1 + num2;
        System.out.println("division= " + division);
    }

    public void DivisionByParameter(Double num1, Double num2){
        Double division= num1 + num2;
        System.out.println("division= " + division);
    }

    public Double DivisionByReturnValue(){
        Double num1 = 54.5;
        Double num2 = 2.4;
        Double division= num1 + num2;
        return division;
    }

    public Double DivisionByParameterAndReturnValue(Double num1, Double num2){
        Double division= num1 + num2;
        return division;
    }
}
