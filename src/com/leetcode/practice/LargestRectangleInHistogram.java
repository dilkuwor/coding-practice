package com.leetcode.practice;

import java.util.Arrays;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] heights = {2,1,2};
        System.out.println(largestRectangleArea(heights));
    }

    public static int largestRectangleArea(int[] heights) {
            int start = 0;
            int end = 0;
            int max = Integer.MIN_VALUE;
            int last = heights.length-1;
            while(start<heights.length)
            {
                end = start+1;
                while(start<=last && end<=last && heights[end]>=heights[start])
                {
                    end++;
                }

                max = Math.max(max, heights[start] * (end - start));
                start++;
            }
            return max;

        }

}
