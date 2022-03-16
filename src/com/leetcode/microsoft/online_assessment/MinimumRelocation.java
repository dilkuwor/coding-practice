package com.leetcode.microsoft.online_assessment;
/*
https://leetcode.com/discuss/interview-question/1768686/Microsoft-OA-Codility
 */
public class MinimumRelocation {
    public static void main(String[] args) {
//    int[] test = {10,-10,-1,-1,10};
        int[] test = {50, -49, -1, -1, -1, 2};

System.out.println(minimumRelocation(test));
    }

    static int  minimumRelocation(int[] arr)
    {
        int relocation = 0;
        int start = 0;
        int end = arr.length - 1;
        int sum = 0;
        while (start<end){
           sum +=arr[start];
           if(sum<=0)
           {
               //find non negative number
               while (arr[end]<0){
                   end--;
               }
               int temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               //update sum
              // start--;
               relocation++;
           }
           start++;
        }

        return relocation;
    }
}
