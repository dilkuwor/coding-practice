package com.leetcode.microsoft.trees_n_graph;

import com.leetcode.amazon.treesandgraph.TreeNode;

public class IsSameTree {
    public static void main(String[] args) {

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        else if (p == null && q!=null || q == null && p !=null || p.val!=q.val)
            return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
