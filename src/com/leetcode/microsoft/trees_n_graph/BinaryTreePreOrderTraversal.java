package com.leetcode.microsoft.trees_n_graph;

import com.leetcode.amazon.treesandgraph.TreeNode;
import com.leetcode.microsoft.DataHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreOrderTraversal {
    public static void main(String[] args) {
        BinaryTreePreOrderTraversal bst = new BinaryTreePreOrderTraversal();


        for(int a: bst.recursive(DataHelper.getBST()))
        {
            System.out.println(a);
        }
    }

    public List<Integer> recursive(TreeNode root)
    {
        List<Integer> result = new ArrayList<>();
        recursivePreOrderTraversal(root,result);
        return result;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        Stack<TreeNode> stack = new Stack();
        while(root!=null || !stack.isEmpty())
        {
            while(root!=null)
            {
                result.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return result;
    }


    void recursivePreOrderTraversal(TreeNode root, List<Integer> result)
    {
        if(root!=null)
        {
            result.add(root.val);
            recursivePreOrderTraversal(root.left,result);
            recursivePreOrderTraversal(root.right, result);
        }
    }

}
