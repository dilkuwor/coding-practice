package com.leetcode.microsoft.arrays_n_string;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome p = new ValidPalindrome();
        String test = "A man, a plan, a canal: Panama";
        System.out.println(p.isPalindrome(test));

    }

    public boolean isPalindrome(String s)
    {
        if(s.isEmpty())
            return true;

        StringBuilder bldr = new StringBuilder();
        for(char c: s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                bldr.append(Character.toLowerCase(c));
            }
        }

        String result = bldr.toString();
        return result.equals(bldr.reverse().toString());
    }
    public boolean isPalindrome1(String s) {

        if(s.isEmpty())
            return true;


        int low = 0;
        int high = s.length()-1;

        while(low<=high)
        {
            //move forward
            while(low<high && !Character.isLetterOrDigit(s.charAt(low)))
            {
                low++;
            }

            //move backward
            while(low<high && !Character.isLetterOrDigit(s.charAt(high)))
            {
                high--;
            }

            if(s.toLowerCase().charAt(low)!=s.toLowerCase().charAt(high))
                return false;
            low++;
            high--;

        }

        return true;

    }
}
