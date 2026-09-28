package com.shauryax.method.Subtraction;

public class SubtractWIntTwoNumberUserMethod {
    public static void main(String[] args) {
        SubtractWIntTwoNumberUserMethod Subtract = new SubtractWIntTwoNumberUserMethod();
        Subtract.Subtraction();
        Subtract.SubtractionByParameter(72365, 184);
        Integer returnValue = Subtract.SubtractionByReturnValue();
        System.out.println("The subtraction is " + returnValue);
        Subtract.SubtractionByReturnValue();

        Integer ParameterReturn = Subtract.SubtractionByParameterAndReturnValue(58472, 365);
        System.out.println("The subtraction is " + ParameterReturn);
    }

    public void Subtraction(){
        Integer num1 = 867;
        Integer num2 = 243;
        Integer subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public void SubtractionByParameter(Integer num1, Integer num2){
        Integer subtraction = num1 - num2;
        System.out.println("subtraction= " + subtraction);
    }

    public Integer SubtractionByReturnValue(){
        Integer num1 = 958;
        Integer num2 = 476;
        Integer subtraction = num1 - num2;
        return subtraction;
    }

    public Integer SubtractionByParameterAndReturnValue(Integer num1, Integer num2){
        Integer subtraction = num1 - num2;
        return subtraction;
    }
}
