package com.shauryax.Testing.Multiplication;

public class MultiplyWLongNumber {

        public void multiplications(){
            Long num1 = 12434342l;
            Long num2 = 124342l;
            Long multiplication = num1 * num2;
            System.out.println("multiplication is = " + multiplication);
        }

        public Long multiplicationByReturnValue(){
            Long num1 = 12434342l;
            Long num2 = 124342l;
            Long multiplication = num1 * num2;
            System.out.println("multiplicationByReturnValue is = " + multiplication);
            return multiplication;
        }

        public Long multiplicationByParameterAndReturnValue(Long num1, Long num2){
            Long multiplication = num1 * num2;
            System.out.println("multiplicationByParameterAndReturnValue is = " + multiplication);
            return multiplication;
        }

        public void multiplicationByParameter(Long num1, Long num2){
            Long multiplication = num1 * num2;
            System.out.println("multiplicationByParameter is = " + multiplication);
        }
}
