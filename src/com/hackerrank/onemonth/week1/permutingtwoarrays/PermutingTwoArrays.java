package com.hackerrank.onemonth.week1.permutingtwoarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(0);

        List<Integer> B = new ArrayList<>();
        B.add(0);
        B.add(2);
        int k = 1;
        System.out.println(twoArrays(k,A,B));
    }
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here

        Collections.sort(A);
        Collections.sort(B);

        System.out.println(A);
        for(int i = 0,j=B.size()-1;i<A.size();i++,j--)
        {
            if(A.get(i) + B.get(j)<k)
                return "NO";
        }
        return "YES";
    }
}
