package com.shauryax.Testing.Multiplication;

public class MultiplyWDoubleNumber {
    public class MultiplyDoubleNumber {
        public void multiplications() {
            Double num1 = 233.23;
            Double num2 = 12.12;
            Double multiplication = num1 * num2;
            System.out.println("multiplication = " + multiplication);
        }

        public Double multiplicationByReturnValue() {
            Double num1 = 233.23;
            Double num2 = 12.12;
            Double multiplication = num1 * num2;
            System.out.println("multiplicationByReturnValue = " + multiplication);
            return multiplication;
        }

        public void multiplicationByParameter(Double num1, Double num2) {
            Double multiplication = num1 * num2;
            System.out.println("multiplicationByParameter = " + multiplication);
        }

        public void multiplicationByParameterAndReturnValue(Double num1, Double num2) {
            Double multiplication = num1 * num2;
            System.out.println("multiplicationByParameterAndReturnValue = " + multiplication);
        }

    }
}