package com.leetcode.microsoft.practice_ms_questions;

import com.leetcode.amazon.treesandgraph.TreeNode;

import java.util.Stack;

public class TreeHeight {
    public static void main(String[] args) {
        TreeHeight height = new TreeHeight();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(4);
        root.left.right = new TreeNode(33);
        root.left.right.right = new TreeNode(3);
        System.out.println(height.findTreeHeight(root));
    }

    int findTreeHeight(TreeNode root)
    {
        int height = 0;
        if(root == null)
            return height;

        int tempHeight = 0;
        Stack<TreeNode> stack = new Stack<>();
        while (root!=null || !stack.isEmpty())
        {
            while (root!=null)
            {

                stack.push(root);
                root = root.left;
                tempHeight++;
            }
            root = stack.pop();
            root = root.right;
            height = Math.max(height,tempHeight);
        }

        return height-1;
    }
}
