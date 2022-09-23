package com.leetcode.graph.algorithm;

import java.util.HashMap;
import java.util.Map;

public class DisjointSet {
    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet();
        for(int i = 1;i<=7;i++)
        {
            ds.add(i);
        }
        int[][] edges = {{1,2},{2,3},{4,5},{6,7},{5,6},{3,7}};
        /*
        1->2  3->4, 2->4
         */

        //union operation
        for(int[] edge: edges)
        {
            ds.union(edge[0],edge[1]);
        }

        System.out.println(ds.findSet(1));
        System.out.println(ds.findSet(2));
        System.out.println(ds.isConnected(3,2));
    }
    private Map<Integer, Node> map = new HashMap<>();
    class Node{
        int data;
        Node parent;
        int rank;
    }

    void add(int data)
    {
        Node node = new Node();
        node.data = data;
        node.rank = 0;
        node.parent = node;
        map.put(data,node);
    }


    Node find(Node node)
    {
        Node parent = node.parent;
        if(parent == node)
            return parent;
        node.parent = find(node.parent);
        return node.parent;

    }
    int findSet(int a)
    {
        return find(map.get(a)).data;
    }

    boolean union(int a, int b)
    {
        Node node1 = map.get(a);
        Node node2 = map.get(b);

        Node parent1 = find(node1);
        Node parent2 = find(node2);
        if(parent1.data == parent2.data)
            return false;

        if(parent1.rank>parent2.rank)
        {
            parent2.parent = parent1;
        }
        else if(parent1.rank<parent2.rank)
        {
            parent1.parent = parent2;
        }
        else
        {
            parent2.parent = parent1;
            parent1.rank = parent1.rank+1; //parent 1 got another node so increment the rank
        }
        return true;

    }

    boolean isConnected(int a, int b)
    {
        return map.get(a).parent.data == map.get(b).parent.data;
    }


}
