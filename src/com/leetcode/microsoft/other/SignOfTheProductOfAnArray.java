package com.leetcode.microsoft.other;

public class SignOfTheProductOfAnArray {
    public static void main(String[] args) {
        int[] test = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        SignOfTheProductOfAnArray s = new SignOfTheProductOfAnArray();
        System.out.println(s.arraySign(test));
    }
    public int arraySign(int[] nums) {
        int total = 1;
        for(int i = 0;i<nums.length;i++){
            total *=nums[i]>0?1:nums[i] == 0?0:-1;
        }
        System.out.println(total);
        return total;
    }
}
