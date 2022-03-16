package com.leetcode.ds_challange.day3;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

        int [] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        IntersectionOfTwoArrays t = new IntersectionOfTwoArrays();
        System.out.println(Arrays.toString(t.intersect(nums1,nums2)));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l1 = 0;
        int l2 = 0;
        int counter = 0;
        while(l1<nums1.length && l2<nums2.length)
        {
            if(nums1[l1] == nums2[l2])
            {
                nums1[counter++] = nums1[l1];
                l1++;
                l2++;

            }
            else if (nums1[l1]<nums2[l2])
            {
                l1++;
            }
            else{
                l2++;
            }
        }
        int[] r = new int[counter];

        for(int i  = 0;i<counter;i++)
        {
            r[i] = nums1[i];
        }
        return r;
    }
}
