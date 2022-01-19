package com.leetcode.amazon.arrays_n_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] test = {-1,0,1,2,-1,-4};

        ThreeSum ts = new ThreeSum();
        List<List<Integer>> result = ts.threeSum1(test);
        for(List<Integer> r : result){
            System.out.println(r);
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        // [-1,0,1,2,-1,-4]
        //[-4,-1,-1,0,1,2]
        //[[-1,-1,2],[-1,0,1]]
        List<List<Integer>> lst = new ArrayList<>();

        int counter = 0;
        int size = nums.length;
        int lastCounter = size - 1;
        while (nums[counter]<0){
            lastCounter = size - 1;
            int firstSum = nums[counter] + nums[lastCounter];
            int tempCounter = 0;
            if(firstSum<0){
                tempCounter = lastCounter-1;
                while (firstSum<=0){
                    firstSum = nums[counter] + nums[lastCounter] + nums[tempCounter];
                    if (firstSum==0){
                        //add index and break;
                        counter++;
                    }
                }
                if(firstSum + nums[lastCounter-1] == 0){
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(counter);
                    tmp.add(lastCounter - 1);
                    tmp.add(lastCounter);
                }
            }
            else{

            }

        }
        return null;
    }

    public List<List<Integer>> threeSum1(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int lenght = nums.length;
        for(int i =0;i<lenght-1;i++){
            int target = nums[i];
            HashMap<Integer, Integer> complements = new HashMap();
            for(int j = i+1;j<nums.length;j++){
                int tmp = nums[j];
                int complement = -(target + nums[j]);
                if(complements.containsKey(complement)){
                    List<Integer> indexes = new ArrayList<>();
                    indexes.add(i);
                    indexes.add(j);
                    indexes.add(complements.get(complement));
                    complements.remove(complement);
                }
                else
                {
                    complements.put(complement,j);
                }
            }

        }
        return result;
    }
}
