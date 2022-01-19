package com.leetcode.practice;

/**
 * 162. Find Peak Element
 */
public class FindPeakElement {
    public static void main(String[] args) {

    }

    public int findPeakElement(int[] nums){
        return -1;
    }

    int findPeak(int[] arr,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }
            int tempMid = -1;
            if(arr[mid]<arr[mid-1]){
                tempMid = findPeak(arr,low,mid);
            }
            else { //blind search on right sub array
                tempMid = findPeak(arr,mid,high);
                if(tempMid == -1)
                    tempMid = findPeak(arr,low,mid);
            }



        }
        return -1;
    }
}
