package com.leetcode.contest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EdgeScore {
    public static void main(String[] args) {
        EdgeScore e = new EdgeScore();
        int[] edges = {1,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,1,1};
        System.out.println(e.edgeScore(edges));
    }
    public int edgeScore(int[] edges) {
        int[] score = new int[edges.length];
        int max = 0;
        for(int i = 0;i<edges.length;i++)
        {
           score[edges[i]] +=i;
           max = Math.max(score[edges[i]],max);
        }
        for(int i = 0;i<score.length;i++)
        {
            if(score[i] == max)
                return i;
        }
        return 0;
    }
}
