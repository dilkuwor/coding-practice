package com.leetcode.challenge.days21.day1;

public class MyBinarySearch {
    public int[] search(int[] arr, int start, int end, int target){

        if(start<end){
            int mid = (start + end)/2;
            if(arr[mid] == target)
                return new int[]{start, end};
            else if (arr[mid]> target)
            {
                return search(arr,start, mid -1, target);
            }
            else if (arr[mid]<target)
            {
                return search(arr,mid+1,end,target);
            }
        }

        return new int[]{-1,-1};
    }

    public int searchLeftIndex(int[] arr, int start, int end,int target){
        if(start<end)
            return -1;
        int mid = (start + end)/2;
        return -1;
    }

    public int searchLRMostIndex(int start, int end, int[] arr, boolean directionLeft, int target){
        boolean continueLoop = true;
        int tmp[] = new int[]{start,end};
        int returnIndex = -1;

        while(continueLoop){
            int mid = (tmp[0]+tmp[1])/2;

            if(mid!=tmp[0]){
                if(directionLeft){
                    tmp = this.search(arr,tmp[0],mid,target);

                }
                else{
                    tmp = this.search(arr,mid,tmp[1],target);

                }
                if(tmp[0] == -1)
                    continueLoop = false;
                else{
                    returnIndex = mid;
                }
            }
            else{
                continueLoop = false;
            }

        }
        return returnIndex;
    }
}
