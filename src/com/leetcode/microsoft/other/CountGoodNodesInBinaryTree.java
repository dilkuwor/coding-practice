package com.leetcode.microsoft.other;

import com.leetcode.amazon.treesandgraph.TreeNode;
import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CountGoodNodesInBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(1);
        CountGoodNodesInBinaryTree t = new CountGoodNodesInBinaryTree();

        System.out.println(t.max(root,0));
    }

    class Pair{
        TreeNode node;
        int maxValue;
        Pair(TreeNode node, int max)
        {
            this.node = node;
            this.maxValue = max;
        }
    }
    public int goodNodes(TreeNode root)
    {
        Queue<Pair> myQueue = new LinkedList<>();
        myQueue.offer( new Pair(root,root.val));
        int total = 0;
        int currentMax = Integer.MIN_VALUE;
        while (!myQueue.isEmpty())
        {
            Pair pair = myQueue.poll();
            if(pair.maxValue>currentMax)
            {
                total++;
            }
            if(pair.node.left!=null)
            {
                myQueue.offer(new Pair(pair.node.left,Math.max(pair.maxValue,pair.node.left.val)));
            }
            if(pair.node.right!=null)
            {
                myQueue.offer(new Pair(pair.node.right,Math.max(pair.maxValue,pair.node.right.val)));
            }

        }
        return total;
    }

    public int goodNodes1(TreeNode root) {
        int total = 1;
        int max = 0;

        return max(root,Integer.MAX_VALUE);
    }

    public int max(TreeNode root, int max)
    {
        if(root == null)
            return 0;
        return ((root.val>=max?1:0) + max(root.left,Math.max(max,root.val)) + max(root.right,Math.max(max,root.val)));
    }
}
