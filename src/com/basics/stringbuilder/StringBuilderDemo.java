package com.basics.stringbuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder bldr = new StringBuilder();
        String str = new String("apple");
        String str2 = "apple";

        char[] dest = new char[67];

        str2.getChars(0,3,dest,0);
        System.out.println(dest);

    }
}
