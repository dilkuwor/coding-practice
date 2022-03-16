package com.leetcode.ds_challange.day2;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray srt = new MergeSortedArray();
//        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        Output: [1,2,2,3,5,6]

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        srt.merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int n1 = m-1;
        int n2 = n-1;
        for(int i = nums1.length-1;i>=0;i--)
        {
            if(n1>=0 &&n2>=0 && nums1[n1]>=nums2[n2])
            {
                nums1[i] = nums1[n1];
                n1--;
            }
            else if(n2>=0){
                nums1[i] = nums2[n2];
                n2--;
            }
        }
    }
}
