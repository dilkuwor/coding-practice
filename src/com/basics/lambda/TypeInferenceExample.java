package com.basics.lambda;

public class TypeInferenceExample {
    public static void main(String[] args) {
        StringLength myStringLength = (String s) -> s.length();
        myStringLength.getLength("Hello World");

    }

    interface StringLength{
        int getLength(String str);
    }
}
