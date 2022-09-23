package com.leetcode.contest;

public class AddSumBinary {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        while(a==1)
        {
            int carry = (a&b)<<1;
            b = (a^b);
            a = carry;
        }
        System.out.println(b);
    }
}
