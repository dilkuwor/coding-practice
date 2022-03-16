package com.leetcode.microsoft.practice_ms_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FindIfPathExistInGraph {
    public static void main(String[] args) {
        FindIfPathExistInGraph f = new FindIfPathExistInGraph();
        int[][] test = {{}};
        System.out.println(f.validPath(1,test,0,3));
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean[] visited = new boolean[n];


        for(int[] edge:edges)
        {
            int a = edge[0];
            int b = edge[1];
            map.put(a,b);
        }

        Queue<Integer> myQueue = new LinkedList<Integer>();
        myQueue.add(source);
        visited[source] = true;
        while(!myQueue.isEmpty())
        {
            int a = myQueue.poll();
            if(a == destination)
            {
                return true;
            }

            int b = map.get(a);
            if(visited[b] == false)
            {
                myQueue.add(b);
                visited[b] = true;
            }

        }
        return false;
    }
}
