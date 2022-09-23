package com.leetcode.contest;

import java.util.*;

public class ReachableNodeWithRestriction {
    public static void main(String[] args) {
        ReachableNodeWithRestriction r = new ReachableNodeWithRestriction();
        int[][] edges = new int[][]{{0,1},{0,2},{0,5},{0,4},{3,2},{6,5}};
        int[] restricted = {4,2,1};
        System.out.println(r.reachableNodes(7,edges,restricted));
    }

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        Set<Integer> res = new HashSet<>();
        for(int a: restricted)
        {
            res.add(a);
        }
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int[] edge: edges)
        {
             map.putIfAbsent(edge[0],new ArrayList<>());
            map.putIfAbsent(edge[1],new ArrayList<>());
             map.get(edge[0]).add(edge[1]);
             map.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);

        Set<Integer> seen = new HashSet<>();
        seen.add(0);
        int count = 1;
        while(!queue.isEmpty())
        {
            int node = queue.poll();

            if(map.containsKey(node))
            for(int adj : map.get(node))
            {
                if(!res.contains(adj) && !seen.contains(adj))
                {
                    seen.add(adj);
                    count++;
                    queue.offer(adj);
                }
            }
        }
        return count;

    }
}
