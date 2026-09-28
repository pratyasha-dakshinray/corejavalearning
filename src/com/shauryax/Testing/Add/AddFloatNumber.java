package com.shauryax.Testing.Add;

public class AddFloatNumber {


        public void addition(){
            float num1 = 53.45f;
            float num2 = 123.45f;
            float sum = num1 + num2;
            System.out.println("The sum is = " + sum);
        }

        public void additionByParameter(float num1, float num2 ){
            float sum = num1 + num2;
            System.out.println("The sum is = " + sum);
        }

        public float additionByReturnValue(){
            float num1 = 342.34f;
            float num2 = 323.34f;
            float sum = num1 + num2;
            System.out.println("The sum is = " + sum);
            return sum;
        }

        public float additionByParameterAndReturnValue(float num1, float num2){
            float sum = num1 + num2;
            System.out.println("The sum is = " + sum);
            return sum;
        }

}
