package com.leetcode.practice;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {9,6,7,8,9,9};
        SecondLargest l = new SecondLargest();
        System.out.println(l.second(arr));
    }

    int second(int[] arr)
    {
       int max = Integer.MIN_VALUE;
       int secondMax = Integer.MIN_VALUE;
       for(int i = 0;i<arr.length;i++)
       {
           if(arr[i]>max)
           {
               secondMax = max;
               max = arr[i];
           }
           else if (max>arr[i] && arr[i]>secondMax)
           {
               secondMax = arr[i];
           }
       }
       return secondMax;
    }
}
