package com.leetcode.ds_challange.day4;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {

        PascalTriangle p = new PascalTriangle();
        List<List<Integer>> restul = p.generate(5);

        for(List<Integer> r: restul){
            for(int a:r){
                System.out.print(a);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        //edge case
        if (numRows == 0)
            return result;

        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);

        for (int i = 1; i < numRows; i++) {
            first = new ArrayList<>();
            int s = 0;
            while (s < i + 1) {
                if (s == 0 || s == i)
                    first.add(1);

                else {
                    first.add(result.get(i - 1).get(s - 1) + result.get(i - 1).get(s));
                }
                s++;
            }
            result.add(first);
        }

        return result;
    }
}
