package com.leetcode.practice;

import java.util.Arrays;

public class LengthOfLastString {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        LengthOfLastString l = new LengthOfLastString();
        System.out.println(l.lengthOfLastWord(s));
    }

    public int lengthOfLastWord1(String s) {
        if(s.isEmpty())
            return 0;
        s = s.trim();
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        return arr[arr.length - 1].length();
    }

    public int lengthOfLastWord(String s) {
        if(s.isEmpty())
            return 0;

        s = s.trim();
        int l = s.length()-1;
        StringBuilder bldr = new StringBuilder();
        while(s.charAt(l)!=' ')
        {
            bldr.insert(0,s.charAt(l));
            l--;
        }
        return bldr.toString().length();
    }
}
