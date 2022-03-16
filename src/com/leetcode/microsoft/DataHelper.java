package com.leetcode.microsoft;

import com.leetcode.amazon.linkedlist.ListNode;
import com.leetcode.amazon.treesandgraph.TreeNode;

import java.util.concurrent.ThreadLocalRandom;

public class DataHelper {
    public static int[] getRandomArray(int size){
        int[] test = new int[size];

        for(int i = 0;i<test.length;i++)
        {
            test[i] =  ThreadLocalRandom.current().nextInt(0, 1000 + 1);
        }

        return test;
    }

    public static void printMatrix(int[][] matrix)
    {
        for(int i =0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println();
        }
    }

    public static TreeNode getBST()
    {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(1);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(10);
        return root;
    };
    public static ListNode linkedList()
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(8);
        return head;
    }

    public static long marker(){
        return System.nanoTime();
    }
}
