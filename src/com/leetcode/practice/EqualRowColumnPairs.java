package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class EqualRowColumnPairs {
    public static void main(String[] args) {
        EqualRowColumnPairs ec = new EqualRowColumnPairs();
       // int[][] arr = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
       // int[][] arr = {{3,2,1},{1,7,6},{2,7,7}};
        int[][] arr = {{3,1,2,2},{1,4,4,4},{2,4,2,2},{2,5,2,2}};
        System.out.println(ec.equalPairs(arr));
    }

    public int equalPairs(int[][] grid) {
        Map<String, Integer> row = new HashMap<>();
        Map<String, Integer> col = new HashMap<>();

        for(int i = 0;i<grid.length;i++)
        {
            int cnt = 0;
            StringBuilder rr = new StringBuilder();
            StringBuilder cc = new StringBuilder();
            for(int j = 0;j<grid[0].length;j++)
            {
                rr.append(grid[i][j]+",");
                cc.append(grid[j][i]+",");
            }
            row.putIfAbsent(rr.toString(),0);
            row.put(rr.toString(),row.get(rr.toString())+1);

            col.putIfAbsent(cc.toString(),0);
            col.put(cc.toString(),col.get(cc.toString())+1);


        }
        int res = 0;
        for(String k: row.keySet())
        {
            if(col.containsKey(k))
            {
                res +=row.get(k) * col.get(k);
            }
        }
        return res;

    }
}
