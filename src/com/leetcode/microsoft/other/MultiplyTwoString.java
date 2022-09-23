package com.leetcode.microsoft.other;

import java.util.Locale;

public class MultiplyTwoString {
    public static void main(String[] args) {
        MultiplyTwoString m = new MultiplyTwoString();
        System.out.println(m.multiply("555","555"));
    }

    public String multiply(String s1, String s2)
    {
        int m = s1.length();
        int n = s2.length();
        int[] arr = new int[m+n];
        for(int j = m-1;j>=0;j--)
        {
            for(int k = n-1;k>=0;k--)
            {
                int result = (s1.charAt(j) - '0')*(s2.charAt(k) - '0') ;
                int sum = result + arr[j+k+1];
                arr[j+k] += sum/10;
                arr[j+k+1] = sum%10;
            }

        }

        StringBuilder bldr = new StringBuilder();
        for(int val: arr)
        {
            if(bldr.length()!=0 || val!=0)
            {
                bldr.append(val);
            }
        }
        return bldr.length() == 0?"0":bldr.toString();
    }

    public String add(String s1, String s2)
    {
        //while ()
        return "";
    }
}
