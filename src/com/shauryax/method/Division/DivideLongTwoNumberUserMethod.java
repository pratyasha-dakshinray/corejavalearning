package com.shauryax.method.Division;

public class DivideLongTwoNumberUserMethod {
    public static void main(String[] args) {
        DivideWIntTwoNumberUserMethod Divide = new DivideWIntTwoNumberUserMethod();
        Divide.Division();
        Divide.DivisionByParameter(757656762,6457);
        long returnValue = Divide.DivisionByReturnValue();
        System.out.println("The division is " + returnValue);
        Divide.DivisionByReturnValue();

        long ParameterReturn = Divide.DivisionByParameterAndReturnValue(284124,29873);
        System.out.println("The division is " +  ParameterReturn);
    }

    public void Division(){
        long num1 = 1487665;
        long num2 = 2564764;
        long division= num1 + num2;
        System.out.println("division= " + division);
    }

    public void DivisionByParameter(long num1, long num2){
        long division= num1 + num2;
        System.out.println("division= " + division);
    }

    public long DivisionByReturnValue(){
        long num1 = 545674654;
        long num2 = 246;
        long division= num1 + num2;
        return division;
    }

    public long DivisionByParameterAndReturnValue(long num1, long num2){
        long division= num1 + num2;
        return division;
    }
}
