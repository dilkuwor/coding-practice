package com.leetcode.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinOperationToDelete {
    public static void main(String[] args) {
        MinOperationToDelete m = new MinOperationToDelete();
        //[3,2,6,2,35,5,35,2,5,8,7,3,4]
        //[105,70,70,175,105,105,105]
        int[] nums = {3,2,6,2,35,5,35,2,5,8,7,3,4};
        int[] divides = {105,70,70,175,105,105,105};
        System.out.println(m.minOperations(nums,divides));
    }

    Set<Integer> ignore = new HashSet<>();
    public int minOperations(int[] nums, int[] numsDivide) {

        Arrays.sort(nums);
        int del = 0;
        for(int i = 0;i<nums.length;i++)
        {
            int a = nums[i];
            if(divideAll(numsDivide,a))
            {
                System.out.println(a);
                return del;
            }
            else
            {
                int t = i;
                while(t<nums.length && nums[t] == a)
                {
                    del++;
                    t++;
                }

                if(t!=i)
                {
                    i = t-1;
                }


            }
        }
        return -1;
    }

    boolean divideAll(int[] numsDivide, int num)
    {
        Set<Integer> ignore = new HashSet<>();
        for(int a: ignore)
        {
            if(num%a == 0)
            {
                return false;
            }
        }
        for(int a:numsDivide)
        {
            if(a%num!=0)
                return false;
        }
        return true;
    }
}
