package com.leetcode.microsoft.trees_n_graph;

import com.leetcode.amazon.treesandgraph.TreeNode;
import com.leetcode.microsoft.DataHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        //root.left.left = new TreeNode(-1);

        root.right = new TreeNode(3);
        ValidateBinarySearchTree bst = new ValidateBinarySearchTree();
        for(int a: bst.inorderTraversalMorris(DataHelper.getBST()))
        {
            System.out.println(a);
        }
        //System.out.println(bst.isValidBST(root));
    }

    public boolean isValidBST(TreeNode root) {
        return validate(root,null,null);
    }

    /*
    Validate BST with iterative approach
     */
    boolean validateInorder(TreeNode root)
    {
        TreeNode prev = null;
        Stack<TreeNode> stack = new Stack<>();
        while (root!=null || !stack.isEmpty())
        {
            while (root!=null)
            {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if(prev!=null && prev.val>= root.val)
                return false;
            root = root.right;
        }
        return true;
    }

    List<Integer> inorderTraversalMorris(TreeNode root)
    {
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        TreeNode prev;
        while(current!=null)
        {
            if(current.left == null)
            {
                result.add(current.val);
                current = current.right;
            }
            else{
                prev = current.left;
                while(prev.right!=null)
                {
                    prev = prev.right;
                }

                prev.right = current;
                TreeNode t = current;
                current = current.left;
                t.left = null;
            }
        }
        return result;
    }

    boolean validate(TreeNode root, Integer low, Integer high)
    {
        if(root == null)
            return true;

        if(low!=null && low>=root.val || high!=null && high<=root.val)
            return false;
        return validate(root.left, low, root.val) && validate(root.right, root.val, high);
    }

    List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root!=null || !stack.isEmpty())
        {
            while (root!=null)
            {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }
}
