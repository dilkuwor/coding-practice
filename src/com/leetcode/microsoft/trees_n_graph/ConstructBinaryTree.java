package com.leetcode.microsoft.trees_n_graph;

import com.leetcode.amazon.treesandgraph.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ConstructBinaryTree {
    public static void main(String[] args) {
        ConstructBinaryTree bt = new ConstructBinaryTree();
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode t = bt.buildTree(preorder,inorder);


        for(int a: bt.inorderTraversal(t))
        {
            System.out.println(a);
        }


    }

    List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || root!=null)
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

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        TreeNode root = new TreeNode(preorder[0]);
        for(int i = 1;i<preorder.length;i++)
        {
            add(root,preorder[i]);
        }

        return root;


    }

    void add(TreeNode root, int a)
    {
        TreeNode child = new TreeNode(a);
        TreeNode current = root;
        while(current!=null)
        {
            if(a<current.val)
            {
                if(current.left == null)
                {
                    current.left = child;
                    return;
                }
                current = current.left;
            }
            else if (a>current.val)
            {
                if(current.right == null)
                {
                    current.right = child;
                    return;
                }
                current = current.right;
            }
        }
    }
}
