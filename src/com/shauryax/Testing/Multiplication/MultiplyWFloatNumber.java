package com.shauryax.Testing.Multiplication;


    public class MultiplyWFloatNumber {
        public void multiplication() {
            Float num1 = 12.3f;
            Float num2 = 12.3f;
            Float multiplication = num1 * num2;
            System.out.println("multiplication = " + multiplication);
        }

        public void multiplicationByParameter(Float num1, Float num2) {
            Float multiplication = num1 * num2;
            System.out.println("multiplicationByParameter = " + multiplication);
        }

        public Float multiplicationByReturnValue() {
            Float num1 = 12.3f;
            Float num2 = 12.3f;
            Float multiplication = num1 * num2;
            System.out.println("multiplicationByReturnValue = " + multiplication);
            return multiplication;
        }

        public Float multiplicationByParameterAndReturnValue(Float num1, Float num2) {
            Float multiplication = num1 * num2;
            System.out.println("multiplicationByParameterAndReturnValue = " + multiplication);
            return multiplication;
        }

    }