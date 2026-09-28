package com.shauryax.method.Division;



public class DivideWIntTwoNumberUserMethod {
    public static void main(String[] args) {
        DivideWIntTwoNumberUserMethod Divide = new DivideWIntTwoNumberUserMethod();
        Divide.Division();
        Divide.DivisionByParameter(623,7);
        Integer returnValue = Divide.DivisionByReturnValue();
        System.out.println("The division is " + returnValue);
        Divide.DivisionByReturnValue();

        Integer ParameterReturn = Divide.DivisionByParameterAndReturnValue(24124,23);
        System.out.println("The division is " +  ParameterReturn);
    }

    public void Division(){
        Integer num1 = 145;
        Integer num2 = 25;
        Integer division= num1 + num2;
        System.out.println("division= " + division);
    }

    public void DivisionByParameter(Integer num1, Integer num2){
        Integer division= num1 + num2;
        System.out.println("division= " + division);
    }

    public Integer DivisionByReturnValue(){
        Integer num1 = 545;
        Integer num2 = 24;
        Integer division= num1 + num2;
        return division;
    }

    public Integer DivisionByParameterAndReturnValue(Integer num1, Integer num2){
        Integer division= num1 + num2;
        return division;
    }
}
