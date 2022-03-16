package com.leetcode.microsoft.trees_n_graph;

import com.leetcode.amazon.treesandgraph.TreeNode;
import com.leetcode.microsoft.DataHelper;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeZigZagLevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeZigZagLevelOrderTraversal bst = new BinaryTreeZigZagLevelOrderTraversal();
        for(List<Integer> arr: bst.zigzagLevelOrder(DataHelper.getBST()))
        {
            for(int a: arr)
            {
                System.out.print(a +"\t");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        recursiveLevelOrder(root,result,0);

        for(int i =0;i<result.size();i++)
        {
            if(i%2 != 0)
            {
                reverseArray(result.get(i));
            }
        }

        return result;
    }

    void reverseArray(List<Integer> arr)
    {
        int start = 0;
        int end = arr.size() -1;
        while (start<=end)
        {
            Integer temp = arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }

    }

    void recursiveLevelOrder(TreeNode root, List<List<Integer>> result, int level)
    {
        if(root == null)
            return;
        if(result.size() == level)
            result.add(new ArrayList<>());

        result.get(level).add(root.val);

        recursiveLevelOrder(root.left, result, level+1);
        recursiveLevelOrder(root.right, result, level+1);
    }
}
