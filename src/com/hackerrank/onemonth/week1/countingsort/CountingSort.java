package com.hackerrank.onemonth.week1.countingsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(50);
        arr.add(50);
        arr.add(34);

        System.out.print(countingSort(arr));
    }

    public static List<Integer> countingSort(List<Integer> arr) {

        // Write your code here

        int[] sorted = new int[100];

        for(int a:arr){
            sorted[a] +=1;
        }
        List<Integer> ans = new ArrayList<>();
        for(int a: sorted){
            ans.add(a);
        }
        return ans;
    }
}
