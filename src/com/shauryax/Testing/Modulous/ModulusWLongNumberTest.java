package com.shauryax.Testing.Modulous;

public class ModulusWLongNumberTest {
    public static void main(String[] args) {
        ModulusWLongNumber modulusWLongNumber = new ModulusWLongNumber();
        modulusWLongNumber.modulusByReturnValue();
        modulusWLongNumber.modulus();
        modulusWLongNumber.modulusByParameterAndReturnValue(23123123l, 244l);
        modulusWLongNumber.modulusByParameter(23443545l, 343l);
    }
}
