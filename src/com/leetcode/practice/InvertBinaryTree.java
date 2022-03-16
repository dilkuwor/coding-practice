package com.leetcode.practice;

import com.leetcode.amazon.treesandgraph.TreeNode;
import com.sun.source.tree.Tree;

import java.util.Queue;
import java.util.Stack;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode n = new TreeNode(4);
        n.left = new TreeNode(2);
        n.left.left = new TreeNode(1);
        n.left.right = new TreeNode(3);
        n.right = new TreeNode(7);
        n.right.left = new TreeNode(6);
        n.right.right = new TreeNode(9);
        InvertBinaryTree b = new InvertBinaryTree();
        b.invertTree(n);

        Stack<TreeNode> stack = new Stack<>();
        stack.add(n);


    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
