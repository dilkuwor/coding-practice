package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleDemo {
    /*
    Input: 4
    Output:
    [   1   ]
       1 1
      1 2 1
     1 3 3 1
   [1 4 6 4 1 ]
     */
    public static void main(String[] args) {
        PascalTriangleDemo demo = new PascalTriangleDemo();
        System.out.println(demo.generate(5));
    }

    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);

        List<Integer> previous = new ArrayList<>();
        previous = row;
        for(int i = 1;i<numRows;i++){
            List<Integer> new_row = new ArrayList<>();
            new_row.add(1);
            for(int j = 1;j<i;j++){
                int sum = previous.get(j-1) + previous.get(j);
                new_row.add(sum);
            }
            new_row.add(1);
            result.add(new_row);
            previous = new_row;
        }
        return result;
    }
}
