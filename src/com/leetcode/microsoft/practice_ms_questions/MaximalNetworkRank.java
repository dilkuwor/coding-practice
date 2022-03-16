package com.leetcode.microsoft.practice_ms_questions;

import java.util.HashMap;

public class MaximalNetworkRank {
    public static void main(String[] args) {
        MaximalNetworkRank m = new MaximalNetworkRank();
        int[][] test =  {{0,1},{0,3},{1,2},{1,3},{2,3},{2,4}};
        System.out.println(m.maximalNetworkRank(5,test));
    }

    public int maximalNetworkRank(int n, int[][] roads) {
        boolean[][] connected = new boolean[n][n];
        int[] edges = new int[n];

        for(int[] road: roads)
        {
            int a = road[0];
            int b = road[1];
            edges[a]++;
            edges[b]++;
            connected[a][b] = true;
            connected[b][a] = true;
        }

        int max = 0;
        for(int i = 0;i<n-1;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                max = Math.max(max,edges[i] + edges[j] - (connected[i][j] == true?1:0));
            }
        }
        return max;
    }
}
