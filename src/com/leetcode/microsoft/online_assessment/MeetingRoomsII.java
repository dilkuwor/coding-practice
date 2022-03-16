package com.leetcode.microsoft.online_assessment;

import com.leetcode.microsoft.DataHelper;

import java.util.Arrays;

public class MeetingRoomsII {
    public static void main(String[] args) {
        int[][] test = {{0,30},{5,10},{15,20}};
        //Arrays.sort(test);
        //Arrays.sort(test, (a, b) -> Double.compare(a[0], b[0]));
        //DataHelper.printMatrix(test);
        System.out.print(minMeetingRooms(test));
    }

    public static int minMeetingRooms(int[][] intervals)
    {
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for(int i =0;i<intervals.length;i++)
        {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        int rooms = 0;
        Arrays.sort(start);
        Arrays.sort(end);
        int endPointer = 0;
        for(int startPointer = 0;startPointer<start.length;startPointer++)
        {
            if(start[startPointer]<end[endPointer]) //meeting has not finished yet
                rooms++;
            else{
                endPointer++;
            }

        }

        return rooms;
    }
    public static int minMeetingRooms1(int[][] intervals) {
        //edge case
        if(intervals.length == 1)
            return 1;

        int count = 1;
        for(int i = intervals.length-1;i>0;i--)
        {

            int tmp = i - 1;
            boolean hasOverlap = false;
            while(tmp>=0)
            {
                int[] arr = intervals[i];
if(intervals[tmp][0]<=arr[0] && intervals[tmp][1]>=arr[0] ||
intervals[tmp][0]>=arr[0] && intervals[tmp][0]<=arr[1])
                {
                    hasOverlap = true;
                    break;
                }
                tmp--;
            }
            if(hasOverlap)
            {

                count++;
            }

        }

        return count;

    }
}
