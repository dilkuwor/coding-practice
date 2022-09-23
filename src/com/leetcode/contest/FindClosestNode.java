package com.leetcode.contest;

import java.util.*;

public class FindClosestNode {
    public static void main(String[] args) {
        FindClosestNode f = new FindClosestNode();
        int[] edges = {5,-1,3,4,5,6,-1,-1,4,3};
        int node1 = 0;
        int node2 = 0;
        System.out.println(f.closestMeetingNode(edges,node1,node2));
    }

    public int closestMeetingNode(int[] edges, int node1, int node2) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0;i<edges.length;i++)
        {
            map.putIfAbsent(i,new ArrayList<>());
            map.get(i).add(edges[i]);
        }
        if(!map.containsKey(node1) && !map.containsKey(node2))
            return 0;

        int min = Integer.MAX_VALUE;
        TreeMap<Integer, Integer> first = iterat(map,node1);
        TreeMap<Integer, Integer> second = iterat(map,node2);
        int node = -1;
        for(int a: first.keySet())
        {
            if(a!=0 && second.containsKey(a))
            {
                if(min>first.get(a))
                {
                    node = a;
                    min = first.get(a);
                }
            }
        }

        for(int a: second.keySet())
        {
            if(a!=0 && first.containsKey(a))
            {
                if(min>second.get(a))
                {
                    node = a;
                    min = second.get(a);
                }
            }
        }


        return node;

    }

    TreeMap<Integer, Integer> iterat(Map<Integer, List<Integer>> map, int node1)
    {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> dist = new Stack<>();
        stack.add(node1);
        dist.add(0);
        TreeMap<Integer, Integer> first = new TreeMap<>();
        first.put(node1,0);
        Set<Integer> seen = new HashSet<>();
        seen.add(node1);
        while(!stack.isEmpty())
        {
            int a = stack.pop();
            int d = dist.pop();
            for(int aa: map.get(a))
            {
                if(!seen.contains(aa) && aa!=-1)
                {
                    seen.add(aa);
                    first.put(aa,d+1);
                    stack.push(aa);
                    dist.push(d+1);
                }
            }
        }
        return first;
    }
}
