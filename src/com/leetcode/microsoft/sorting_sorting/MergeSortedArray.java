package com.leetcode.microsoft.sorting_sorting;

public class MergeSortedArray {
    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m+n-1;i>=0;i--)
        {
            if(m>=0 && n>=0 && nums1[m]>nums1[n])
            {
                nums1[i] = nums1[m];
                m--;
            }
            {
                nums1[i] = nums2[n];
                n--;
            }
        }
    }
}
