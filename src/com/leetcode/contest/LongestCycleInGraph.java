package com.leetcode.contest;

import java.util.*;

public class LongestCycleInGraph {
    public static void main(String[] args) {
        LongestCycleInGraph lc = new LongestCycleInGraph();
        int[] edges = {4,3,3,4,7,2,3,3};
        System.out.println(lc.longestCycle(edges));
    }

    public int longestCycle(int[] edges) {
        Map<Integer,Integer> graph = new HashMap<>();
        Set<Integer> indegree = new HashSet<>();
        for(int i = 0;i<edges.length;i++)
        {
            if(edges[i]!=-1)
            {
                graph.put(i,edges[i]);
                indegree.add(edges[i]);
            }
        }

        int longest = Integer.MIN_VALUE;
        for(int i = 0;i<edges.length;i++)
        {
            if(indegree.contains(i))
            {
                longest = Math.max(longest,findLength(graph,i,new HashSet<>()));
            }
        }
        return longest;

    }

    int findLength(Map<Integer,Integer> graph, int node, Set<Integer> visited)
    {
        if(visited.contains(node))
            return 0;
        if(!graph.containsKey(node))
            return -1;

        visited.add(node);
        int length = findLength(graph, graph.get(node),visited);
        if(length!=-1)
            return length+1;
        return -1;
    }
}
