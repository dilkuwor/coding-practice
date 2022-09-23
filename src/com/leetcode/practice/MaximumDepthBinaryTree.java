package com.leetcode.practice;

import com.leetcode.amazon.treesandgraph.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthBinaryTree {
    public static void main(String[] args) {
        MaximumDepthBinaryTree m = new MaximumDepthBinaryTree();
    }

    public int maxDepth(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int count = 0;
        while(!queue.isEmpty())
        {
            count++;
            int size = queue.size();
            while(size>0)
            {
                TreeNode node = queue.peek();
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
                count--;
            }
        }
        return count;
    }
}
