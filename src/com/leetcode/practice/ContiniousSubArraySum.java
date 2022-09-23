package com.leetcode.practice;

public class ContiniousSubArraySum {
    public static void main(String[] args) {
        ContiniousSubArraySum c = new ContiniousSubArraySum();
        int[] arr = {10,3,6,4,7};
        int k = 13;
        System.out.println(c.checkSubarraySum(arr,k));
    }
    public boolean checkSubarraySum(int[] nums, int k) {

        for(int i = 0;i<nums.length;i++)
        {
            int sum = 0;
            for(int j = i;j<nums.length;j++)
            {
                sum +=nums[j];
                if(sum%k == 0 && j-i>1)
                    return true;

            }
        }
        return false;
    }
}
