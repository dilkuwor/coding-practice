package com.leetcode.algo_challenge.day4;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        ReverseString r = new ReverseString();
        r.reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void reverseString(char[] s) {

        int i =0;
        int j = s.length-1;
        while(i<j)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

    }
}
