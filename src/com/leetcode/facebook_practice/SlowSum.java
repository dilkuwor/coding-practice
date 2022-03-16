package com.leetcode.facebook_practice;

import java.util.Arrays;

public class SlowSum {
    public static void main(String[] args) {
    int[] test = {1,2,3,4};
    System.out.println(getMax(test));
    }

    static int getMax(int[] arr)
    {
        Arrays.sort(arr);
        int total = 0;
        int penalty = 0;
        for(int i = arr.length - 1;i>0;i--)
        {
            int tmp = arr[i] + arr[i-1];
            arr[i-1] = tmp;
            penalty = tmp;
            total +=penalty;
        }
        return total;
    }
}
