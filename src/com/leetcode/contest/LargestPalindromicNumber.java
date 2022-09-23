package com.leetcode.contest;

import java.util.Arrays;

public class LargestPalindromicNumber {
    public static void main(String[] args) {
        LargestPalindromicNumber lp = new LargestPalindromicNumber();
        System.out.println(lp.largestPalindromic("0"));
    }

    public String largestPalindromic(String num) {
        int[] arr = new int[10];
        for(char c: num.toCharArray())
        {
            System.out.println(c-'0');
            arr[c-'0']++;
        }

        StringBuilder bldr = new StringBuilder();
        int start = 0;
        int max = -1;
        for(int i = arr.length-1;i>=0;i--)
        {
            if(bldr.length() == 0 &&i!=0 || bldr.length()>0)
            while(arr[i]>=2)
            {
                arr[i] -=2;
                bldr.insert(start++, i+"");
                bldr.insert(start, i+"");
            }
            if(arr[i] == 1)
            {
                max = Math.max(max,i);
            }
        }

        if(max>=0)
        {
            bldr.insert(start,max+"");
        }
        if(bldr.isEmpty() && !num.isEmpty())
        {
            bldr.insert(start,0+"");
        }
        return bldr.toString();
    }
}
