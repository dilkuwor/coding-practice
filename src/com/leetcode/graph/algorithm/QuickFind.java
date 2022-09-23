package com.leetcode.graph.algorithm;

public class QuickFind {
    public static void main(String[] args) {
        QuickFind uf = new QuickFind(10);
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
    public QuickFind(int size)
    {
        data = new int[size];
        for(int i = 0;i<size;i++)
        {
            data[i] = i;
        }
    }

    int find(int x)
    {
        return data[x];
    }

    void union(int x, int y)
    {
        int rootX = find(x);
        int rootY = find(y);

        if(rootX!=rootY)
        {
            for(int i = 0;i<data.length;i++)
            {
                if(data[i] == rootY)
                {
                    data[i] = rootX;
                }
            }
        }
    }

    boolean connected(int x, int y)
    {
        return data[x] == data[y];
    }
}
