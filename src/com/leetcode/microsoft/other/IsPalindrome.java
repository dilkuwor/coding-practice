package com.leetcode.microsoft.other;

public class IsPalindrome {
    public static void main(String[] args) {
        int a = 11211;
        System.out.println(isPalindrome(a));

    }

    static boolean isPalindrome(int x)
    {
        if(x<0 || (x%10 == 0 && x!=0))
            return false;
        int revert = 0;
        int base = 10;
        int temp = x;
        int count = 0;
        while(temp>0)
        {
            revert = revert*base + temp%10;
            temp = temp / 10;
            count++;
        }

        System.out.println(count);

        return x == revert;
    }
}
