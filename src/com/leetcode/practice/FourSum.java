package com.leetcode.practice;

import java.nio.file.ClosedWatchServiceException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FourSum {
    public static void main(String[] args) {
        FourSum f = new FourSum();
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        for(List<Integer> lst: f.fourSum(arr,target))
        {
//            System.out.println(Arrays.toString(lst.stream()
//                    .mapToInt(Integer::intValue)
//                    .toArray()));
            System.out.println(lst.toString());
        }
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, target, 0, 4);
    }

//    public List<List<Integer>> kSum(int[] nums, long target, int start, int k) {
//        List<List<Integer>> res = new ArrayList<>();
//
//        // If we have run out of numbers to add, return res.
//        if (start == nums.length) {
//            return res;
//        }
//
//        // There are k remaining values to add to the sum. The
//        // average of these values is at least target / k.
//        long average_value = target / k;
//
//        // We cannot obtain a sum of target if the smallest value
//        // in nums is greater than target / k or if the largest
//        // value in nums is smaller than target / k.
//        if  (nums[start] > average_value || average_value > nums[nums.length - 1]) {
//            return res;
//        }
//
//        if (k == 2) {
//            return twoSum(nums, target, start);
//        }
//
//        for (int i = start; i < nums.length; ++i) {
//            if (i == start || nums[i - 1] != nums[i]) {
//                for (List<Integer> subset : kSum(nums, target - nums[i], i + 1, k - 1)) {
//                    res.add(new ArrayList<>(Arrays.asList(nums[i])));
//                    res.get(res.size() - 1).addAll(subset);
//                }
//            }
//        }
//
//        return res;
//    }
//
//    public List<List<Integer>> twoSum(int[] nums, long target, int start) {
//        List<List<Integer>> res = new ArrayList<>();
//        int lo = start, hi = nums.length - 1;
//
//        while (lo < hi) {
//            int currSum = nums[lo] + nums[hi];
//            if (currSum < target || (lo > start && nums[lo] == nums[lo - 1])) {
//                ++lo;
//            } else if (currSum > target || (hi < nums.length - 1 && nums[hi] == nums[hi + 1])) {
//                --hi;
//            } else {
//                res.add(Arrays.asList(nums[lo++], nums[hi--]));
//            }
//        }
//
//        return res;
//    }

    List<List<Integer>> kSum(int[] nums,long target, int start, int k)
    {

        List<List<Integer>>  result = new ArrayList<>();

        if(start == nums.length)
            return result;

        // There are k remaining values to add to the sum. The
        // average of these values is at least target / k.
        long average_value = target / k;

        // We cannot obtain a sum of target if the smallest value
        // in nums is greater than target / k or if the largest
        // value in nums is smaller than target / k.
        if  (nums[start] > average_value || average_value > nums[nums.length - 1]) {
            return result;
        }

        if(k == 2)
            return twoSum(nums,start,target);

        for(int i = start;i<nums.length;i++)
        {
            if(i == start || nums[i-1]!=nums[i])
            {
                for(List<Integer> subSet: kSum(nums,target-nums[i], i+1,k-1))
                {
                    result.add(Arrays.asList(nums[i]));
                    result.get(result.size()-1).addAll(subSet);
                }
            }
        }
        return result;
    }

    List<List<Integer>> twoSum(int[] nums, int i, long target)
    {
        List<List<Integer>> res = new ArrayList<>();
        int lo = i+1;
        int hi = nums.length-1;
        while(lo<hi)
        {
            int sum = nums[lo] + nums[hi];
            if(sum>target || hi+1<nums.length && (nums[hi] == nums[hi+1]))
            {
                hi--;
            }
            else if (sum<target || lo>i && (nums[lo-1] == nums[lo]))
            {
                lo++;
            }
            else{
                res.add(Arrays.asList(nums[lo++],nums[hi--]));
            }
        }
        return res;
    }
}
