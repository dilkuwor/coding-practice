package com.leetcode.other;

import com.leetcode.amazon.treesandgraph.TreeNode;

//Minimum Depth of Binary Tree
public class MinimumDepthBinaryTree {
    public static void main(String[] args) {

    }
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;

        return helper(root,0);
    }

    int helper(TreeNode root, int depth)
    {
        if(root!=null)
        {
            helper(root.left,depth++);
            helper(root.right, depth++);
        }
        return 0;
    }

}
