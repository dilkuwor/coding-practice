package com.leetcode.contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideIntervalsIntoMinimumGroups {
    public static void main(String[] args) {
        int[][] intervals = {{5,10},{5,1},{6,8},{1,5},{2,3},{1,10}};
        DivideIntervalsIntoMinimumGroups g = new DivideIntervalsIntoMinimumGroups();
        System.out.println(g.minGroups(intervals));
    }

    public int minGroups(int[][] intervals) {

        Arrays.sort(intervals,(a,b) ->a[0] == b[0]?a[1]-b[1]:a[0]-b[0]);
        for(int[] arr: intervals)
            System.out.println(Arrays.toString(arr));
        List<List<int[]>> groups = new ArrayList<>();
        int gmax = 1;
        int lmax = 1;
        for(int i = 1;i<intervals.length;i++) {
            if(intervals[i][0]<=intervals[i-1][1])
                lmax++;
            else{
                gmax = Math.max(gmax,lmax);
                lmax = 0;
            }

        }
        return gmax;
    }
}
