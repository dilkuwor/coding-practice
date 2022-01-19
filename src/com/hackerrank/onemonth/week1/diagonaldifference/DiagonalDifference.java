package com.hackerrank.onemonth.week1.diagonaldifference;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        DiagonalDifference ds = new DiagonalDifference();
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        List<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
        b.add(6);

        List<Integer> c = new ArrayList<>();
        c.add(9);
        c.add(8);
        c.add(9);

        arr.add(a);
        arr.add(b);
        arr.add(c);

        System.out.println(diagonalDifference(arr));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int d1 = 0;
        int d2 = 0;
        for(int i =0;i<arr.size();i++){
            for(int j = 0;j<arr.get(0).size();j++)
            {
                if(i == j)
                {
                    d1 += arr.get(i).get(j);
                }

                if((i+j) == arr.size()-1)
                {
                    d2+=arr.get(i).get(j);
                }
            }
        }

        return Math.abs(d1-d2);
    }
}
