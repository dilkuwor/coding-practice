package com.leetcode.microsoft.trees_n_graph;

import com.leetcode.amazon.treesandgraph.TreeNode;
import com.leetcode.microsoft.DataHelper;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRecursiveTraversal {
    public static void main(String[] args) {
        BinaryTreeRecursiveTraversal bst = new BinaryTreeRecursiveTraversal();
        bst.printPreOrder();
        bst.printInOrder();
        bst.printPostOrder();
    }
    void printPreOrder()
    {
        List<Integer> result = new ArrayList<>();
        System.out.println("\nPre order traversal:");
        preOrderRecursive(DataHelper.getBST(),result);
        for(int c: result)
        {
            System.out.print(c+"\t");
        }
    }

    void printInOrder()
    {
        List<Integer> result = new ArrayList<>();
        System.out.println("\nIn order traversal:");
        inorderRecursive(DataHelper.getBST(),result);
        for(int c: result)
        {
            System.out.print(c+"\t");
        }
    }

    void printPostOrder()
    {
        List<Integer> result = new ArrayList<>();
        System.out.println("\nPost order traversal:");
        postOrderRecursive(DataHelper.getBST(),result);
        for(int c: result)
        {
            System.out.print(c+"\t");
        }
    }

    void preOrderRecursive(TreeNode root, List<Integer> result)
    {
        if (root!=null)
        {
            result.add(root.val);
            preOrderRecursive(root.left,result);
            preOrderRecursive(root.right,result);
        }
    }
    void postOrderRecursive(TreeNode root, List<Integer> result)
    {
        if (root!=null)
        {

            postOrderRecursive(root.left,result);
            postOrderRecursive(root.right,result);
            result.add(root.val);
        }
    }

    void inorderRecursive(TreeNode root, List<Integer> result)
    {
        if (root!=null)
        {
            inorderRecursive(root.left,result);
            result.add(root.val);
            inorderRecursive(root.right,result);
        }
    }
}
