package com.leetcode.amazon.treesandgraph;

import com.sun.source.tree.Tree;

import java.util.*;

public class SymmetricTree {
    public static void main(String[] args) {
        SymmetricTree st = new SymmetricTree();

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        //[2,3,3,4,5,null,4]
        System.out.println(st.isSymmetric(root));


    }

    public boolean isSymmetric(TreeNode root) {
        return  validate(root,root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2)
    {
        if(t1== null && t2==null)
        {
            return true;
        }
        else if(t1== null || t2==null)
        {
            return false;
        }
        else
            return (t1.val == t2.val) && isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);
    }

    /*
     * recursive approach to validate symmetric tree
     */
    boolean validate(TreeNode t1, TreeNode t2)
    {
        if(t1==null && t2==null)
            return true;
        if(t1 == null || t2 == null)
            return false;

        return t1.val == t2.val && validate(t1.left,t2.right) && validate(t1.right,t2.left);

    }

    boolean isSymmetricWithQueue(TreeNode root)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();

            if(t1 == null && t2 == null) continue;
            if(t1 == null || t2 == null) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t1.left);
        }
        return true;
    }
}
