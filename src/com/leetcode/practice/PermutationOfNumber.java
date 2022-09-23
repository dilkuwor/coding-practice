package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        PermutationOfNumber p = new PermutationOfNumber();
        p.permute(arr);;
    }

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        per(nums,new ArrayList<>(),new boolean[nums.length]);
        for (List<Integer> r: res)
        {
            System.out.println(r.stream().collect(Collectors.toList()));
        }
        return res;
    }

    void per(int[] nums, List<Integer> curr, boolean[] used)
    {
        if(curr.size() == nums.length)
        {
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0;i<nums.length;i++)
        {
            if(used[i]==false)
            {
                used[i] = true;
                curr.add(nums[i]);
                per(nums,curr,used);
                curr.remove(curr.size()-1);
                used[i] = false;
            }

        }
    }

    void p(int[] arr, int start)
    {
        if(start == arr.length)
            System.out.println(Arrays.toString(arr));

        for(int i = start;i<arr.length;i++)
        {
            swap(arr,start,i);
            p(arr,start+1);
            swap(arr,start,i);
        }
    }

    void swap(int[] arr, int start, int end)
    {
        int t = arr[start];
        arr[start] = arr[end];
        arr[end] = t;
    }
}
