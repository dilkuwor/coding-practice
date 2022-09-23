package com.leetcode.graph.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        LongestConsecutiveSequence ls = new LongestConsecutiveSequence();
        int[] nums = { 0,3,7,2,5,8,4,6,0,1};
        System.out.println(ls.longestConsecutive(nums));
    }
    public int longestConsecutive(int[] nums) {
        DisjointSet ds = new DisjointSet(nums.length);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            int val = nums[i];
            if(map.containsKey(val))
                continue;
            if(map.containsKey(val-1))
                ds.union(map.get(val-1),i);

            if(map.containsKey(val+1))
                ds.union(i,map.get(val+1));

            map.put(val,i);
        }
        return ds.getMaxRank();
    }

    class DisjointSet{
        private int[] parent;
        private int[] rank;
        private int maxRank;
        public DisjointSet(int size)
        {
            this.parent = new int[size];
            this.rank = new int[size];
            for(int i = 0;i<size;i++)
            {
                this.parent[i] = i;
                this.rank[i] = 1;
            }
            maxRank = 1;
        }

        int find(int x)
        {
            if(x == parent[x])
                return x;
            return parent[x] = find(parent[x]);
        }

        void union(int x, int y)
        {
            int px = find(x);
            int py = find(y);
            if(px != py)
            {
                parent[px] = py;
                rank[py] +=rank[px];
//                if(rank[px]>rank[py])
//                {
//                    parent[py] = px;
//                }
//                else if (rank[px]<rank[py])
//                {
//                    parent[px] = py;
//                }
//                else{
//                    parent[py] = px;
//                    rank[px] +=rank[py];
//
//                }

                maxRank = Math.max(maxRank,rank[py]);
            }
        }

        int getMaxRank()
        {
            return maxRank;
        }
    }
}
