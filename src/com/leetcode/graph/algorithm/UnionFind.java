package com.leetcode.graph.algorithm;

import java.util.Arrays;

public class UnionFind {
    public static void main(String[] args) {
        UnionFind uf = new UnionFind(10);
        uf.union(1,2);
        uf.union(2,5);
        uf.union(5,6);
        uf.union(6,7);
        uf.union(3,8);
        uf.union(8,9);

        System.out.println(uf.connected(1, 5)); // true
        System.out.println(uf.connected(5, 7)); // true
        System.out.println(uf.connected(4, 9)); // false


    }
    private int[] data;
    public UnionFind(int size)
    {
        data = new int[size];
        for(int i = 0;i<size;i++)
        {
            data[i] = i;
        }
    }

    int find(int x)
    {
        System.out.println("Finding root of "+x);
        while(x!=data[x])
        {
            x = data[x];
            System.out.println(Arrays.toString(data));
        }
        System.out.println("Root is"+x);
        return x;
    }

    void union(int x, int y)
    {
        int rootX = find(x);
        int rootY = find(y);

        if(rootX!=rootY)
        {
            data[rootY] = rootX;
        }
    }

    boolean connected(int x, int y)
    {
        return data[x] == data[y];
    }
}
