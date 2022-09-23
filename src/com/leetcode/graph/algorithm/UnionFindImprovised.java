package com.leetcode.graph.algorithm;

/*
disjoint set algorithm with path compression and rank
 */
public class UnionFindImprovised {
    int[] data;
    int[] rank;
    public UnionFindImprovised(int size)
    {
        data = new int[size];
        rank = new int[size];
        for(int i = 0;i<size;i++)
        {
            data[i] = i;
            rank[i] = 1;
        }
    }

    int find(int x)
    {
        if(x == data[x])
            return x;
        return data[x] = find(data[x]);
    }

    void union(int x, int y)
    {
        int rootX = find(x);
        int rootY = find(y);
        if(rootX!=rootY)
        {
            if(rank[rootX]>rank[rootY])
            {
                data[rootY] = rootX;
            }
            else if(rank[rootX]<rank[rootY])
            {
                data[rootX] = rootY;
            }
            else{
                data[rootY] = rootX;
                rank[rootX] +=1;
            }
        }
    }

    public boolean connected(int x, int y)
    {
        return find(x) == find(y);
    }
}
