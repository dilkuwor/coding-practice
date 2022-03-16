package com.leetcode.microsoft.other;

public class PalindromeNumber {
    public static void main(String[] args) {
        int a = 121;
        String s = a+"";

        System.out.println(isPalindrome(a));
    }

    public static boolean isPalindrome(int x)
    {

        return false;
    }
    public static boolean isPalindrome1(int x) {
        String s = x+"";
        int start = 0;
        int end = s.length()-1;
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;

    }
}
