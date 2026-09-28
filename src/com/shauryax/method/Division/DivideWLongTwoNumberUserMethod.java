package com.shauryax.method.Division;

public class DivideWLongTwoNumberUserMethod {
    public static void main(String[] args) {
        DivideWLongTwoNumberUserMethod Divide = new DivideWLongTwoNumberUserMethod();
        Divide.Division();
        Divide.DivisionByParameter(757656762l,6457l);
        Long returnValue = Divide.DivisionByReturnValue();
        System.out.println("The division is " + returnValue);
        Divide.DivisionByReturnValue();

        Long ParameterReturn = Divide.DivisionByParameterAndReturnValue(284124l,29873l);
        System.out.println("The division is " +  ParameterReturn);
    }

    public void Division(){
        Long num1 = 1487665l;
        Long num2 = 2564764l;
        Long division= num1 + num2;
        System.out.println("division= " + division);
    }

    public void DivisionByParameter(Long num1, Long num2){
        Long division= num1 + num2;
        System.out.println("division= " + division);
    }

    public Long DivisionByReturnValue(){
        Long num1 = 545674654l;
        Long num2 = 246l;
        Long division= num1 + num2;
        return division;
    }

    public Long DivisionByParameterAndReturnValue(Long num1, Long num2){
        Long division= num1 + num2;
        return division;
    }
}
