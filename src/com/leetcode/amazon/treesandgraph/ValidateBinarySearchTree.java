package com.leetcode.amazon.treesandgraph;

import java.util.Stack;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {

        ValidateBinarySearchTree vs = new ValidateBinarySearchTree();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        System.out.println(vs.isValidBST(root));

    }

    /**
     * Validate BST wiht in order tree traversal
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {

        Stack<TreeNode> myStack = new Stack<TreeNode>();

        TreeNode prev = null;

        while(root!=null || !myStack.isEmpty())
        {
            while(root!=null)
            {
                myStack.push(root);
                root = root.left;
            }

            root = myStack.pop();
            if(prev!=null && (root.val<=prev.val))
                return false;

            prev = root;
            root = root.right;
        }

        return true;
        //return validate(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }


    boolean validate(TreeNode root, long lower, long upper)
    {
        return root == null|| (root.val<upper) && (root.val>lower) && validate(root.left,lower,root.val) && validate(root.right,root.val,upper);

    }
}
