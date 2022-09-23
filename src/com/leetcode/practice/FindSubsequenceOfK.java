package com.leetcode.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
2099. Find Subsequence of Length K With the Largest Sum
 */
public class FindSubsequenceOfK {
    public static void main(String[] args) {
        FindSubsequenceOfK f = new FindSubsequenceOfK();
        int[] arr = {-1,-2,3,4};
        int k = 3;
        System.out.println(Arrays.toString(f.maxSubsequence(arr,k)));
    }

    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>
                (Comparator.comparingInt(i -> nums[i]));
        for (int i = 0; i < nums.length; ++i) {
            pq.offer(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.stream().sorted().mapToInt(i -> nums[i]).toArray();
    }
}
