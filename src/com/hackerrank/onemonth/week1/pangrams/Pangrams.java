package com.hackerrank.onemonth.week1.pangrams;

import java.util.Arrays;
import java.util.Locale;

public class Pangrams {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(pangrams(s));
    }

    public static String pangrams(String s) {
        // Write your code here

        s = s.toUpperCase().replaceAll(" ","");
        int[] charFrequency = new int[26];
        Arrays.fill(charFrequency,-1);

        for(char c: s.toCharArray())
        {

            charFrequency[c-'A'] = 1;
        }

        for(int a:charFrequency)
        {
            if(a<0)
                return "not pangram";
        }
        return "pangram";

    }
}
