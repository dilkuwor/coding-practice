package com.leetcode.microsoft.arrays_n_string;

import java.util.Arrays;

/*
Reverse word inplace memory
 */
public class ReverseWordII {
    public static void main(String[] args) {
        ReverseWordII r = new ReverseWordII();
        char[] arr = {'a'};
        r.reverseWords(arr);
        System.out.println(Arrays.toString(arr));

    }

    public void reverseWords(char[] s) {
        //edge case
        if(s.length == 0)
            return;

        //reverse first time
        reverse(s,0,s.length-1);

        for(int i  = 0;i<s.length;i++)
        {
            int start = i;
            while(i<s.length && s[i]!=' ')
            {
                i++;
            }
            reverse(s,start,i-1);

        }

    }
    void reverse(char[] arr, int start, int end)
    {
        for(int i = start,j=end;i<=j;)
        {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }
}
