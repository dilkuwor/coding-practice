package com.leetcode.pathsum;

import com.leetcode.amazon.treesandgraph.TreeNode;

import java.util.Stack;

public class PathSum {
    public static void main(String[] args) {
//[1,-2,-3,1,3,-2,null,-1]
        /*
                  1
                /   \
               -2   -3
             /   \  /  \
             1    3 -2  null
            /
           -1
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(-2);
        root.left.left.left = new TreeNode(-1);

        PathSum ps = new PathSum();
        System.out.print(ps.hasPathSum(root, -4));

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
     /*
                  1
                /   \
               -2   -3
             /   \  /  \
             1    3 -2  null
            /
           -1
         */

        TreeNode temp = root;
        Stack<TreeNode> stack = new Stack<>();
        int total = 0;
        while(!stack.isEmpty() || root!=null)
        {
            while(root!=null)
            {
                total +=root.val;
                stack.push(root);
                root = root.left;

            }

            root = stack.pop();

            if(root.left == null && root.right == null && total == targetSum)
            {
                return true;
            }

            if(root.right == null || (!stack.isEmpty() && stack.peek() == temp))
            {
                total -= root.val;
            }
            System.out.println(total);
            root = root.right;
        }

        return false;
    }
}
