package com.leetcode.practice;

public class FrequencyRangeFilter {
    public static void main(String[] args) {
        FrequencyRangeFilter f = new FrequencyRangeFilter();
        int[] frequencies = {8,15,14,16,21};
        int[][] filtersRanges = {{10,17},{13,15},{13,17}};
        System.out.println(f.countSignal(filtersRanges,frequencies));
    }

    int countSignal(int[][] filterRanges, int[] frquencies)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int[] arr: filterRanges)
        {
            min = Math.min(min, arr[0]);
            max = Math.max(max,arr[1]);
        }

        int count = 0;

        int[] overlap = new int[2];
        for(int[] arr: filterRanges)
        {
            if(arr[0]>min && arr[1]<max)
            {
                overlap = arr;
                break; //there will be only one filter
            }
        }
        for(int a: frquencies)
        {
            if(overlap[0]<=a && overlap[1]>=a)
                count++;
        }
        return count;
    }
}
