package com.leetcode.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSumIIDemo {
    public static void main(String[] args) {
        //[2,7,11,15] target =

        int [] arr = {2,7,11,15};
        TwoSumIIDemo d = new TwoSumIIDemo();
        System.out.println(Arrays.toString(d.twoSum(arr,8)));
    }

    public int[] twoSum(int[] numbers, int target){
        int  a_pointer = 0;
        int b_pointer = numbers.length -1;

        while(a_pointer<=b_pointer){
            int sum = numbers[a_pointer] + numbers[b_pointer];
            if(sum>target){
                b_pointer--;
            }
            else if (sum<target){
                a_pointer++;
            }
            else
                return new int[]{a_pointer+1,b_pointer+1};
        }
        return new int[]{a_pointer+1,b_pointer+1};
    }
    public int[] twoSum1(int[] numbers, int target){
        Set<Integer> complements = new HashSet<>();
        int count = 0;
        while(count<numbers.length && numbers[count]<target  ){
            int num = numbers[count];
            int complement = target - num;
            System.out.println(complement);
            if(complements.contains(num)){
                return new int[]{num, complement};
            }
            else
            {
                complements.add(complement);
            }
            count++;
        };
        return null;
    }
}
