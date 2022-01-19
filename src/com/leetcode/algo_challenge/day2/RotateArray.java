package com.leetcode.algo_challenge.day2;

import java.util.Arrays;

//more problems
//415 504 151
public class RotateArray {
    public static void main(String[] args) {
        RotateArray r = new RotateArray();
        int k = 2;
        int[] arr = { -1,-100,3,99};

        //Output: [5,6,7,1,2,3,4]
        r.rotate(arr,k);

        System.out.println(Arrays.toString(arr));
    }

    public void rotate1(int[] nums, int k) {

        int n = nums.length;
        int[] newArr = new int[n];


        for(int i = 0;i<n;i++)
        {
            int newK = (i+k)%n;
            newArr[newK] = nums[i];
        }

        for (int i = 0;i<n;i++){
            nums[i] = newArr[i];
        }

        System.out.println(Arrays.toString(newArr));

    }

    public void rotate(int[] nums, int k){
       k = k%nums.length;

       int count = 0;
       for(int start = 0;count<nums.length;start++){
           int current = start;
           int prev = nums[start];

           do{
               int next = (k+start)%nums.length;
               int temp = nums[next];
               nums[next] = prev;
               prev = temp;
               start = next;
               count++;
           }while (current!=start);
       }
    }
}
