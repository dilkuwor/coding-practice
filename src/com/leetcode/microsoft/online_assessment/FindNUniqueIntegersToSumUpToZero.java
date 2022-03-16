package com.leetcode.microsoft.online_assessment;

import java.util.Arrays;

public class FindNUniqueIntegersToSumUpToZero {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.toString(sumZero(3)));
    }

    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        boolean isEven = n%2 == 0?true:false;
        int count = 1;
        int start = 0;
        int end = isEven?n-1:n-2;
        while (start<end)
        {
            arr[start++] = count;
            arr[end--] = -count;
            count++;

        }
//        if(!isEven)
//        {
//            arr[n-1] = 0;
//        }
        return arr;
    }
}
