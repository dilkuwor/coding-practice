package com.leetcode.microsoft.sorting_sorting;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        SortColors srt = new SortColors();
        int[] test = {1,2,0};
        srt.sortColors(test);
        System.out.print(Arrays.toString(test));
    }

    public void sortColors1(int[] nums)
    {
        int low = 0;
        int high = nums.length - 1;

        for(int i = low;i<=high;)
        {
            if(nums[i] == 0)
            {
                swap(nums,i,low);
                i++;low++;
            }
            else if (nums[i] == 2)
            {
                swap(nums,i,high);
                high--;
            }
            else{
                i++;
            }
        }
    }

    public void sortColors(int[] nums) {


        int startPointer = 0;
        int endPointer = nums.length-1;
        for(int i = 0;i<nums.length;i++)
        {
            System.out.println(Arrays.toString(nums));
            if(nums[i] == 0)
            {
                swap(nums,i,startPointer);
                startPointer++;
            }
            if(nums[i] == 2 && i<endPointer)
            {
                swap(nums,i,endPointer);
                i--;
                endPointer--;

            }
        }

    }

    void swap(int[] nums,int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
