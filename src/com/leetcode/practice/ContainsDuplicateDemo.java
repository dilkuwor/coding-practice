package com.leetcode.practice;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicateDemo {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4};
        ContainsDuplicateDemo d = new ContainsDuplicateDemo();
        System.out.println(d.containsDuplicate(arr));
    }

    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> numbers = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(numbers.contains(nums[i])){
                return true;
            }
            else
                numbers.add(nums[i]);
        }
        return false;
    }
    public boolean containsDuplicateSort(int[] nums){
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == nums[i+1])
                return true;

        }
        return false;
    }
}
