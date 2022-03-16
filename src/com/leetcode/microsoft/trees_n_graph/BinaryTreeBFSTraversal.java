package com.leetcode.microsoft.trees_n_graph;

import com.leetcode.amazon.treesandgraph.TreeNode;
import com.leetcode.microsoft.DataHelper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeBFSTraversal {
    public static void main(String[] args) {
        BinaryTreeBFSTraversal bfs = new BinaryTreeBFSTraversal();
        for(int a: bfs.bfsTraversal(DataHelper.getBST()))
        {
            System.out.print(a+"\t");
        }
    }

    List<Integer> bfsTraversal(TreeNode root)
    {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            TreeNode current = queue.poll();
            if(current!=null)
            {
                result.add(current.val);
                queue.offer(current.left);
                queue.offer(current.right);
            }

        }
        return result;
    }
}
