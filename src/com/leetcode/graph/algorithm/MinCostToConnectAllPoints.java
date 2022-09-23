package com.leetcode.graph.algorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinCostToConnectAllPoints {
    public static void main(String[] args) {
        MinCostToConnectAllPoints m = new MinCostToConnectAllPoints();
        int[][] points = {{0,0},{2,2},{3,10},{5,2},{7,0}};
        System.out.println(m.minCostConnectPoints(points));

    }
    public int minCostConnectPoints(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        //edge = {edge,start,end}
        int n = points.length;
        for(int i = 1;i<n;i++)
        {
            //calculate distance from 0 node to all nodes
            queue.offer(new int[]{distance(0,i,points),0,i});
        }
        boolean[] visited = new boolean[n];
        int result = 0;
        int edgeUsed = 0;
        visited[0] = true;
        while(!queue.isEmpty() && edgeUsed<n-1)
        {
            int[] edge = queue.poll();
            int p2 = edge[2];
            if(!visited[p2])
            {
                result +=edge[0];
                visited[p2] = true;
                for(int i = 0;i<n;i++)
                {
                    if(!visited[i])
                    {
                        queue.offer(new int[]{distance(p2,i,points),p2,i});
                    }
                }
                edgeUsed++;
            }
        }
        return result;
    }

    private int distance(int point1, int point2, int[][] points)
    {

        int distance = Math.abs(points[point1][0] - points[point2][0]) +
                Math.abs(points[point1][1] - points[point2][1]);
        //System.out.println(Arrays.toString(new int[]{point1,point2,distance}));
        return distance;

    }
}
