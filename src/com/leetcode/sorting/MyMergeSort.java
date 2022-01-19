package com.leetcode.sorting;

import java.util.Arrays;

public class MyMergeSort {
    public static void main(String[] args) {
        int[] input = {4,3,7,9,23,4,5};
        System.out.println("Array items before sorting: "+ Arrays.toString(input));
        MyMergeSort m = new MyMergeSort();
        m.mergeSort(input,0,input.length-1);
        System.out.println("Array items after sorting: "+ Arrays.toString(input));
    }

    void mergeSort(int[] arr,int low, int high){
        if(low<high){
            int mid = (low + high)/2;
            mergeSort(arr,low, mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    void merge(int[] arr, int low,int mid, int high){
        System.out.println("Low: "+low+", Mid: "+mid+", High: "+high);
        int n1 = (mid-low)+1;
        int n2 = (high-mid);
        int[] tempArray1 = new int[n1];
        int[] tempArray2 = new int[n2];

        for(int i = 0;i<n1;i++){
            tempArray1[i] = arr[low+i];
        }

        for(int k = 0;k<n2;k++){
            tempArray2[k] = arr[low+mid+k];
        }
        int i = 0;
        int j = 0;
        int counter = low;
        while(i<n1 && j<n2){
            if(tempArray1[i]<=tempArray2[j]){
                arr[counter] = tempArray1[i];
                i++;
            }
            else {
                arr[counter] = tempArray2[j];
                j++;
            }
            counter++;
        }
        while(i<n1){
            arr[counter] = arr[i];
            counter++;
            i++;
        }
        while (j<n2){
            arr[counter]  = arr[j];
            j++;
            counter++;
        }
    }

}
