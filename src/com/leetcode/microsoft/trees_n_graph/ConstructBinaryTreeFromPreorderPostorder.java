package com.leetcode.microsoft.trees_n_graph;

import com.leetcode.amazon.treesandgraph.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ConstructBinaryTreeFromPreorderPostorder {
    public static void main(String[] args) {

        ConstructBinaryTreeFromPreorderPostorder c = new ConstructBinaryTreeFromPreorderPostorder();
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode root = c.buildTree(preorder,inorder);

        //print tree
        System.out.println("Printing tree");
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root!=null)
        {
            while (root!=null)
            {
                System.out.println(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }

    }

    int preOrderIndex;
    Map<Integer,Integer> inorderIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preOrderIndex = 0;
        inorderIndex = new HashMap<>();
        for(int i = 0;i<inorder.length;i++)
        {
            inorderIndex.put(inorder[i],i);
        }
        return arrayToTree(preorder,0,preorder.length-1);

    }

    TreeNode arrayToTree(int[] preorder,int left, int right)
    {
        if(left>right)
            return null;

        int rootValue = preorder[preOrderIndex++];
        TreeNode root = new TreeNode(rootValue);
        root.left = arrayToTree(preorder,left,inorderIndex.get(rootValue)-1);
        root.right = arrayToTree(preorder,inorderIndex.get(rootValue)+1,right);
        return root;
    }
}
