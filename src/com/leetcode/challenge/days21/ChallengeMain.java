package com.leetcode.challenge.days21;

import com.leetcode.challenge.days21.day1.MyBinarySearch;

import java.util.Arrays;

public class ChallengeMain {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int target = 8;
        int[] arr = {5,7,7,7,7,8,8,8,10};
        MyBinarySearch bs = new MyBinarySearch();
        int[] result = bs.search(arr,0,arr.length-1,target);
        System.out.println(Arrays.toString(result));
        if(result[0]>-1){
            System.out.println("Item found..."+arr[(result[0]+result[1])/2]);

            int mid = (result[0] + result[1])/2;

            int leftIndex = bs.searchLRMostIndex(result[0],mid,arr,true,target);
            if(leftIndex==-1)
                leftIndex = mid;
            int right = bs.searchLRMostIndex(mid,result[1],arr,false,target);
            if(right == -1)
                right = mid;

            System.out.println(leftIndex);
            System.out.println(right);

            //right while loop
        }

    }
}
