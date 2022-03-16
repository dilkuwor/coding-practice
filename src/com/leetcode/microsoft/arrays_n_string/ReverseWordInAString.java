package com.leetcode.microsoft.arrays_n_string;

public class ReverseWordInAString {
    public static void main(String[] args) {
        ReverseWordInAString r = new ReverseWordInAString();
        String test = "a good   example";

        System.out.println(r.reverseWords(test));

    }

    public String reverseWords(String s) {

        StringBuilder bldr = new StringBuilder();

        int n = s.length() - 1;
        while(n>=0)
        {
            int temp = 0;
            while(n>=0&& Character.isLetterOrDigit(s.charAt(n)))
            {
                n--;
                temp++;
            }

            if(temp>0)
            {
                bldr.append(s.substring(n+1,temp+n+1));
            }
            boolean c = true;
            while(n>=0 && !Character.isLetterOrDigit(s.charAt(n)))
            {
                if(c==true)
                {
                    bldr.append(s.charAt(n));
                    c = false;
                }

                n--;
            }
        }
        return bldr.toString().trim();

    }
}
