package com.leetcode.practice;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 */
public class FirstAndLastElementInSortedArray {
    public static void main(String[] args) {

        int[] testArray = {2,2};
        FirstAndLastElementInSortedArray t = new FirstAndLastElementInSortedArray();
        int target = 2;
        int leftIndex = t.leftIndex(testArray,0,testArray.length-1,target);
        System.out.println("Left index"+leftIndex);

        int rightIndex = t.rightIndex(testArray,0,testArray.length-1,target);
        System.out.println("Right index"+rightIndex);


    }

    int [] test(){
        return new int[]{1,2};
    }

    int leftIndex(int[] arr, int low, int high, int target){
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        //System.out.println("Low "+low+" High: "+high);
        if(arr[mid] == target){
            //search if the left item equals
            if(mid>0 && arr[mid-1] == target)
                return leftIndex(arr,low,mid-1,target);
            else return mid;
        }
        else if (arr[mid]>target){
            return leftIndex(arr,low,mid-1,target);
        }
        else
            return leftIndex(arr,mid+1,high,target);
    }

    int rightIndex(int[] arr, int low, int high, int target){
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        System.out.println("Low "+low+" High: "+high +" Mid:"+mid);
        if(arr[mid] == target){
            //search if the left item equals
            if(mid<arr.length-1 && arr[mid+1] == target)
                return rightIndex(arr,mid+1,high,target);
            else return mid;
        }
        else if (arr[mid]>target){
            return rightIndex(arr,low,mid-1,target);
        }
        else
            return rightIndex(arr,mid+1,high,target);
    }
}
