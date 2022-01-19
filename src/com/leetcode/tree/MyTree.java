package com.leetcode.tree;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MyTree {
    TreeNode root;
    //insert data
    public void add(int data){
        System.out.println("Inserting data "+data);
        if(root == null)
            root = new TreeNode(data);
        else
        {
            TreeNode current = root;
            TreeNode lastNode = root;
            while(current!=null){
                if(current.val>= data){
                    if(current.left!=null)
                        lastNode = current.left;
                    current = current.left;

                }
                else
                {
                    if(current.right!=null)
                        lastNode = current.right;
                    current = current.right;
                }
            }
            if(lastNode.val>=data)
                lastNode.left = new TreeNode(data);
            else
                lastNode.right = new TreeNode(data);

        }
    }

    public void preOrderTraversal(){

    }

    public void inOrderTraversal(){

    }

    private TreeNode in_order(TreeNode t){
        if(t==null)
            return t;

        return null;
    }
    private void pre_traversal(TreeNode t){

    }

    @Override
    public String toString(){
        List<Integer> data = new ArrayList<>();
        Stack<TreeNode> treeData = new Stack<>();
        treeData.push(root);
        while (!treeData.empty()){
            TreeNode current = treeData.pop();
            if(current!=null){
                data.add(current.val);
                treeData.push(current.left);
                treeData.push(current.right);
            }


        }
        return data.toString();
    }

}
class TreeNode {
    int val;
    public TreeNode(int data){
        this.val = data;
    }
    TreeNode left;
    TreeNode right;
}
