package com.leetcode.practice;

import java.util.Arrays;
import java.util.Stack;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        // [5,6,7,1,2,3,4]
        //

        RotateArray r = new RotateArray();
        r.rotate1(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    //rotate element using stack
    public int[] rotate(int[] nums, int k) {
        Stack<Integer> rotatedItems = new Stack<>();
        int size = nums.length;
        k = k%size; //limit rotation key of array size limit
        for(int i = size-1;i>=0;i--){
            int lastItem = (i-k);
            if(lastItem<0){
                lastItem = lastItem + size;//start from last index;
            }
            rotatedItems.push(nums[lastItem]);
        }
        int counter = 0;
        while(!rotatedItems.isEmpty()){
            nums[counter] = rotatedItems.pop();
            counter++;
        }
        return nums;
    }

    public void rotate1(int[] nums, int k){
       reveres(nums,0,nums.length-1);
       reveres(nums,0,k-1);
       reveres(nums,k, nums.length-1);
    }

    public void reveres(int[] arr, int start, int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
