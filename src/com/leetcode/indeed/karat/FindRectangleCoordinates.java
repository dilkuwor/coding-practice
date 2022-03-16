package com.leetcode.indeed.karat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindRectangleCoordinates {
    public static void main(String[] args) {
        FindRectangleCoordinates c = new FindRectangleCoordinates();
//        [[1,1,1,1,1],
//        [1,0,0,1,1],
//        [1,0,0,1,1],
//        [1,1,1,1,1]]
        int[][] test = {{1, 1, 1, 1, 1}, {1, 0, 0, 1, 1}, {1, 0, 0, 1, 1}, {1, 1, 1, 1, 1}};

        List<List<int[]>> result = c.findRectangles(test);
        for(List<int[]> arr: result)
        {
            for(int[] aa:arr)
            {
                System.out.println(Arrays.toString(aa));
            }
        }
    }

    List<List<int[]>> findRectangles(int[][] arr) {
        List<List<int[]>> result = new ArrayList<>();
        //find first 0
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                List<int[]> vertex = new ArrayList<>();
                if (arr[i][j] == 0) {
                    vertex.add(new int[]{i, j});
                    int r = i;
                    int c = j;
                    //traverse diagonal
                    while (r < arr.length && c < arr[0].length && arr[r][c] == 0) {
                        r++;
                        c++;
                    }
                    if(arr[r][c]!=0)
                    {
                        r--;
                        c--;
                    }
                    vertex.add(new int[]{r, c});
                    result.add(vertex);
                    return result;
                }
            }

        }
        return result;
    }
}

