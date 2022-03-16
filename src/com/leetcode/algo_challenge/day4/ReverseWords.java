package com.leetcode.algo_challenge.day4;

import java.util.Arrays;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        ReverseWords r = new ReverseWords();
        String t = "God Ding";
        System.out.println(r.reverseWords(t));
    }

    public String reverseWords(String s)
    {
        String[] strArray = s.split(" ");

        StringBuilder bldr = new StringBuilder();

        for(String str: strArray){
            String ss = reverse(str);
            bldr.append(ss);
            bldr.append(" ");
        }
        return bldr.toString().strip();
    }
    private String reverse(String s){
        char[] charArr = s.toCharArray();

        int i = 0;
        int j = charArr.length-1;
        while (i<j){
            char tmp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = tmp;
            i++;
            j--;
        }
        return new String(charArr);
    }

    public String reverseWords1(String s) {
        StringBuilder newString = new StringBuilder(s);
        int i = 0;
        int l = 0;
        int e = 0;
        while(i<s.length()){
            while(e<s.length() && s.charAt(l)!=' ')
            {
                e++;
            }
            if(e>s.length())
                l--;
            boolean t = false;
            if(e>i && --e<s.length()){
                while(i<e){
                    char temp = s.charAt(i);
                    newString.setCharAt(i,s.charAt(e));
                    newString.setCharAt(e,temp);
                    i++;
                    e--;
                    t = true;
                }
            }
            if(!t){
                i++;
                l=i;
            }

        }
        return newString.toString();
    }
}
