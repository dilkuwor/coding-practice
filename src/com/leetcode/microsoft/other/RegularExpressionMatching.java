package com.leetcode.microsoft.other;

/*
HARD
Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).


Best example - https://www.youtube.com/watch?v=HAA8mgxlov8&ab_channel=NeetCode

 */
public class RegularExpressionMatching {
    public static void main(String[] args) {
        String s = "aaa";

        System.out.println(s.substring(1,2));
        String p = "ab*a";
//        RegularExpressionMatching r = new RegularExpressionMatching();
//        System.out.println(r.isMatch(s,p));
    }

    public boolean isMatch(String s, String p) {
        if(p.isEmpty())
            return s.isEmpty();

        boolean firstMatch = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');

        if(p.length() >= 2 && p.charAt(1) == '*')
        {
            return isMatch(s,p.substring(2)) //don't use the *
            || firstMatch && isMatch(s.substring(1),p);
        }
        else
            return firstMatch && isMatch(s.substring(1),p.substring(1));
    }




}
