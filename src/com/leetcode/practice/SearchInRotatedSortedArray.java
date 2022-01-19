package com.leetcode.practice;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        SearchInRotatedSortedArray r = new SearchInRotatedSortedArray();
        int[] arr = {3,1};
        System.out.println(r.findIndex(arr,1));
    }

    public int search(int[] nums, int target){
        int pivot = 0;
        if(nums[0]>nums[nums.length-1]){
            pivot = rotationKey(nums);
            System.out.println("Pivot: "+pivot);
        }
        if(pivot>0){
            if(target>=nums[0]){
                return binarySearch(nums,0,pivot,target);
            }
            else if(target<=nums[nums.length-1]){
                return binarySearch(nums,pivot,nums.length-1,target);
            }
            else
                return -1;
        }
        else
            return binarySearch(nums,0,nums.length - 1,target);

    }

    public int rotationKey(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        while (low<=high){
            int mid = (low + high)/2;
            if(mid == low){
                if(nums[mid]>nums[mid+1])
                    return high;
            }
            //[4,5,1,2,3,4] m = 2
            if(nums[mid]<nums[mid-1])
                return mid;
            if(nums[mid]>nums[low]){
                //search in right block
                low = mid;
            }
            else{
                high = mid;
            }
        }
        return 0;

    }

//    public int binarySearch(int[] nums,int low,int high, int target){
//        if(low>high)
//            return -1;
//        int mid = (low+high)/2;
//        if(nums[mid] == target)
//            return mid;
//        if(nums[mid]>target)
//            return binarySearch(nums,low,mid-1,target);
//        else
//            return binarySearch(nums,mid+1,high,target);
//    }

    public int binarySearch(int[] arr,int low, int high, int target){
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid]>target){
                high = mid -1;
            }
            else
                low = mid + 1;
        }
        return -1;
    }

    int findIndex(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target)
                return mid;

            if(nums[mid]>=nums[low]){
                if(target>=nums[low] && target<nums[mid])
                    //left search
                {
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(target>nums[mid] && target <=nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
