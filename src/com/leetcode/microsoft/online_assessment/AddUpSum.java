package com.leetcode.microsoft.online_assessment;

import com.leetcode.microsoft.DataHelper;

import java.util.HashMap;
import java.util.Map;

/*
Question1: Given an array A consisting of N integers, returns the maximum sum of two numbers whose digits add up to an equal sum.
if there are not two numbers whose digits have an equal sum, the function should return -1.
Constraints: N is integer within the range [1, 200000]
each element of array A is an integer within the range [1, 1000000000]

Example1:
Input:
A = [51, 71, 17, 42]
Output: 93
Explanation: There are two pairs of numbers whose digits add up to an equal sum: (51, 42) and (17, 71), The first pair sums up  to 93

Example2:
Input:
A = [42, 33, 60]
Output: 102
Explanation: The digits of all numbers in A add up the same sum, and choosing to add 42 and 60 gives the result 102

Example3:
Input:
A = [51, 32, 43]
Output: -1
Explanation: All numbers in A have digits that add up to different, unique sums

*/
public class AddUpSum {
    public static void main(String[] args) {
        //int[] arr = {51, 71, 17, 42};//
        int[] arr = {51, 32, 43};
        long a = DataHelper.marker();
        int sum = findSum(arr);
        long b = DataHelper.marker();

        System.out.format("Time Diff: %d",b-a);

        long c = DataHelper.marker();
        int aaa = findSum2(arr);
        long d = DataHelper.marker();
        System.out.format("\nTime Diff: %d",d-c);

    }

    static int findSum(int[] arr) {
        Map<Integer, int[]> map = new HashMap<>();
        int maxSum = Integer.MIN_VALUE;
        for(int a: arr)
        {
            int temp = a;
            int sum = 0;
            while(temp>0)
            {
                sum +=temp%10;
                temp /=10;
            }
            if(!map.containsKey(sum))
            {
                map.put(sum, new int[2]);
            }

            int[] tempArray = map.get(sum);
            if(tempArray[0]<a)
            {
                tempArray[0] = a;
            }
            else if(tempArray[1]<a){
                tempArray[1]  = a;
            }

            maxSum = Math.max(maxSum, (tempArray[0]>0 && tempArray[1]>0)? tempArray[0] + tempArray[1]:-1);
        }
       return maxSum;
    }

    static int findSum2(int[] A)
    {
        // write your code here
        Map<Integer, int[]> map = new HashMap<>();
        for (int a : A) {
            int s = 0, tmp = a;
            while (tmp > 0) {
                s += tmp % 10;
                tmp /= 10;
            }

            map.putIfAbsent(s, new int[2]);
            int[] nums = map.get(s);
            if (a > nums[0]) {
                nums[1] = nums[0];
                nums[0] = a;
            } else if (a > nums[1]) {
                nums[1] = a;
            }
        }

        int res = -1;
        for (int[] nums : map.values()) {
            if (nums[1] == 0) {
                continue;
            }
            res = Math.max(res, nums[0] + nums[1]);
        }

        return res;
    }
}
